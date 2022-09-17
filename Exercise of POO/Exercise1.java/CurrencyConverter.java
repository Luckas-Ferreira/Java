public class CurrencyConverter {
        private double price;
        private double amount;
        private double converter;
    
        public double getPrice(){
            return this.price;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public double getAmount() {
            return this.amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }
        public double getConverter(){
            return this.converter;
        }
        public void setConverter(double converter) {
            this.converter = converter;
        }
    
        public double dollarToReal(double amount, double price) {
            this.setPrice(price);
            this.setAmount(amount);
            this.setConverter((this.getPrice() * this.amount) * 0.06 + (this.getPrice() * this.getAmount()));
            return converter;
        }
}
