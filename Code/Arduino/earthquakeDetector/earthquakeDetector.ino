#include<LiquidCrystal.h> // lcd Header
#include <SoftwareSerial.h> //SMS header

SoftwareSerial sim(10, 11); // pins fir GSM Module
LiquidCrystal lcd(7,6,5,4,3,2); // pins for LCD Connection

#define buztime 1000
#define buzzer 12 // buzzer pin
#define led 8 //led pin
 
#define x A2 // x_out pin of Accelerometer
#define y A1 // y_out pin of Accelerometer
#define z A0 // z_out pin of Accelerometer
 
/*variables*/
int xvalue;
int yvalue;
int zvalue;
int xinitial=0;
int yinitial= -1;
int zinitial=0;
int buz;
/*GSM Module variables*/
int _timeout;

//SMS NUMBER
const String PHONE_1 = "+639198452849";
const String PHONE_2 = "+639764933906"; //optional

//MSG
const String msgStudent =  "Earthquake Alert! \n\nAn earthquake has been detected in your area. Residents are advised to duck, cover, and hold. An aftershock is expected in a few minutes. Stay calm and protect yourselves.";

void setup()
{
lcd.begin(16,2); //initializing lcd
Serial.begin(9600); // initializing serial
delay(1000);
lcd.print("EarthQuake ");
lcd.setCursor(0,1);
lcd.print("Detector ");
delay(2000);
lcd.clear();
lcd.print("Calibrating.....");
lcd.setCursor(0,1);
lcd.print("Please wait...");
pinMode(buzzer, OUTPUT);
pinMode(led, OUTPUT);
buz=0;
digitalWrite(buzzer, buz);
digitalWrite(led, buz);
delay(7000); //delay for 7 seconds to make sure the modules get the signal
lcd.print("System Started...");
sim.begin(9600);
delay(1000);
lcd.clear();
lcd.print("Device Ready");
delay(1000);
}
 
void loop()
{
xvalue = analogRead(x);
int x = map(xvalue,272, 406,-100,100);
float xg = (float)x/(-100.00);
Serial.print("\t");
Serial.print(xg);
Serial.print("g   ");

yvalue = analogRead(y);
int y = map(yvalue,276, 360,-100,100);
float yg = (float)y/(-100.00);
Serial.print("\t");
Serial.print(yg);
Serial.print("g   ");

zvalue = analogRead(z);
int z = map(zvalue,272, 407,-100,100);
float zg = (float)z/(1000.00);
Serial.print("\t");
Serial.print(zg);
Serial.print("g   ");
Serial.println();
delay(100);
  
float PGA = sqrt((xg-xinitial)*(xg-xinitial)+(yg-yinitial)*(yg-yinitial)+(zg-zinitial)*(zg-zinitial));
Serial.print(PGA);
delay(100);
lcd.clear();
lcd.print("No Earthquake");
lcd.setCursor(0,1);
lcd.print("PGA: ");
lcd.setCursor(5,1);
lcd.print(PGA);
 
/* comparing change with predefined limits*/
if (PGA > 0.60){
if(buz == 0);
long start=millis();
buz=1;
}
 
else if(buz == 1){
lcd.setCursor(0,0);
lcd.print("Earthquake Alert");
if(millis()>=buztime);
delay(4000);
buz=0;
//
if(PHONE_1 != " "){
  Serial.print("Phone 1: ");
  send_sms(msgStudent,PHONE_1);
  }
if(PHONE_2 != " "){
  Serial.print("Phone 2: ");
  send_sms(msgStudent,PHONE_2);
  }

delay(100);
sim.println((char)26);// ASCII code of CTRL+Z
delay(200);
}
 
digitalWrite(buzzer, buz); // buzzer on and off command
digitalWrite(led, buz); // led on and off command
 
}

void send_sms(String text,String phone)
{
    Serial.println("sending sms....");
    delay(50);
    sim.print("AT+CMGF=1\r");
    delay(1000);
    sim.print("AT+CMGS=\""+ phone +"\"\r");
    delay(100);
    sim.print(text);
    delay(100);
    sim.write(0x1A); //ascii code for ctrl-26 //Serial2.println((char)26); //ascii code for ctrl-26
}

