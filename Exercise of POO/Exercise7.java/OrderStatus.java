package exerc5;

public enum OrderStatus {
  PENDING_PAYMENT(0),
  PROCESSING(1),
  SHIPPED(2),
  DELIVERED(3);

private int value;
OrderStatus(int Value){
  value = Value;
}

public int getValue(){
  return value;
}}