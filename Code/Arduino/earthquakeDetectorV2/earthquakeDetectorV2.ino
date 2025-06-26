#include<LiquidCrystal.h> // lcd Header
#include <SoftwareSerial.h> //SMS header

#define buztime 1000
SoftwareSerial sim(10, 11); // pins fir GSM Module
LiquidCrystal lcd(7,6,5,4,3,2); // pins for LCD Connection

  #define buzzer 12
  #define led 8

  int xpin = A2;
  int ypin = A1;
  int zpin = A0;

  int xvalue;
  int yvalue;
  int zvalue;
  int xinitial=0;
  int yinitial= -1;
  int zinitial=0;
  int buz;
  int _timeout;

  //SMS NUMBER
  const String PHONE_1 = "+639394575828";
  const String PHONE_2 = "+639764933906"; //optional

  //MSG
  const String msgStudent = "asdasdasdasdasdasdasdasd";

  const String msgParent= "iadsodiuaosiduoaisdoas";


void setup() {
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
  delay(7000);
  lcd.clear();
  lcd.setCursor(0,1);
  lcd.print("DEVICE READY");

  pinMode(buzzer,OUTPUT);
  pinMode(led,OUTPUT);
  buz=0;
  delay(3000);

}

void loop() {
  xvalue = analogRead(xpin);
  int x = map(xvalue,272, 406,-100,100);
  float xg = (float)x/(-100.00);
  Serial.print("\t");
  Serial.print(xg);
  Serial.print("g   ");

  yvalue = analogRead(ypin);
  int y = map(yvalue,276, 360,-100,100);
  float yg = (float)y/(-100.00);
  Serial.print("\t");
  Serial.print(yg);
  Serial.print("g   ");

  zvalue = analogRead(zpin);
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
    send_sms(msgStudent, PHONE_1);
  }

delay(100);
sim.println((char)26);// ASCII code of CTRL+Z
delay(200);
}
digitalWrite(buzzer, buz); // buzzer on and off command
digitalWrite(led, buz); // led on and off command
}


void send_sms(String text, String phone)
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
