int buttonPin = 12;
int buzzerPin = 10;
int buttonState;

void setup() {
  pinMode(buzzerPin,OUTPUT);
  pinMode(buttonPin,INPUT_PULLUP);
}

void loop() {
  
  buttonState = digitalRead(buttonPin);
  if(buttonState == LOW){
    digitalWrite(buzzerPin,HIGH);

    }
  else{
    digitalWrite(buzzerPin,LOW);
  
  }


}
