// package cscmssitcoding;
// class StockOwner extends Stock{
//     String name;
//     int money;
//     private static int count;
//     private static int asset;
//     public StockOwner(String name, int money){
//         this.name=name;
//         this.money=money;
//     }
//     public String getName(){
//         return name;
//     }
//     public int getMoney(){
//         return money;
//     }
//     //write your code here
//     public void AddStock(Stock s) {
        
//     }
//     public void buyCar(Stock s, Car c){
//         count++;
//         asset += carPrice;
//         money -= carPrice;

//     }
//     public int calculateAllAsset() {
//         return asset;
//     }
//     public int getAmountofCar() {
//         return count;
//     }
//     public void buyAllCar(Stock s, Stock s1) {
//     }
//   }
//   class Stock extends Car{
//     //write your code here
    
//     public void printAllCar(){
//         System.out.println("Car Name : "+carName);
//         System.out.println("Car Brand : "+carBrand);
//         System.out.println("Car Price : "+carPrice);
//     }
//     public void buy(Car c){
//         super.getCarName();
//         super.getCarBrand();
//         super.getCarPrice();
//     }

//   }
//   class Car{
//     //write your code here
//     String carName;
//     String carBrand;
//     int carPrice;
//     public Car(String name){
//         this.carName=name;
//     }
//     public Car(String name, String brand, int price){
//         this.carName=name;
//         this.carBrand=brand;
//         this.carPrice=price;
//     }
//     public Car(String name, String brand){
//         this.carName=name;
//         this.carBrand=brand;
//     }
//     public Car(){

//     }
//     public String getCarName(){
//         return carName;
//     }
//     public String getCarBrand(){
//         return carBrand;
//     }
//     public int getCarPrice(){
//         return carPrice;
//     }
//     public void setCarName(String name){
//         this.carName=name;
//     }
//     public void setCarBrand(String brand){
//         this.carBrand=brand;
//     }
//     public void setCarPrice(int price){
//         this.carPrice=price;
//     }

//   }
// public class No66 {
//     public static void main(String[] args){
//     	StockOwner Owner1 = new StockOwner("RichMan", 1000000000);
//         Stock s1 = new Stock();
//         Stock s2 = new Stock();
//         Stock s3 = new Stock();
//         Stock s4 = new Stock();
//         Owner1.AddStock(s1);
//         Owner1.AddStock(s3);
//         Owner1.AddStock(s4);
//         Car c1 = new Car();
//         Car c2 = new Car("Rod");
//         Car c3 = new Car("Spike","Benz",20000000);
//         Car c4 = new Car("Lambo","Lambo");
//         Car c5 = new Car("Noname");
//         Car c6 = new Car("Unnamed","Unnamed",300000000);
//         s2.buy(c1);
//         s2.buy(c2);
//         System.out.println("Money of Owner");
//         System.out.println("Name : "+Owner1.getName());
//         System.out.println("Money : "+Owner1.getMoney());
//         System.out.println("___________________________");
//         Owner1.buyCar(s1, c3);
//         Owner1.buyCar(s3, c4);
//         Owner1.buyCar(s3, c5);
//         Owner1.buyCar(s4, c6);
//         System.out.println("Money of Owner <After Buy>");
//         System.out.println("Name : "+Owner1.getName());
//         System.out.println("Money : "+Owner1.getMoney());
//         System.out.println("___________________________");
//         System.out.println("Car in Each Stock");
//         System.out.println("Stock 1");
//         s1.printAllCar();
//         System.out.println("___________________________");
//         System.out.println("Stock 2");
//         s2.printAllCar();
//         System.out.println("___________________________");
//         System.out.println("Stock 3");
//         s3.printAllCar();
//         System.out.println("___________________________");
//         System.out.println("Stock 4");
//         s4.printAllCar();
//         System.out.println("___________________________");
//         Owner1.buyAllCar(s4, s2);
//         System.out.println("Money of Owner <After Buy 2nd time>");
//         System.out.println("Name : "+Owner1.getName());
//         System.out.println("Money : "+Owner1.getMoney());
//         System.out.println("___________________________");
//         System.out.println("All asset");
//         System.out.println("Value of Asset : "+Owner1.calculateAllAsset());
//         System.out.println("Cars : "+Owner1.getAmountofCar());
//         System.out.println("___________________________");
//         System.out.println("Car in Each Stock");
//         System.out.println("Stock 1");
//         s1.printAllCar();
//         System.out.println("___________________________");
//         System.out.println("Stock 2");
//         s2.printAllCar();
//         System.out.println("___________________________");
//         System.out.println("Stock 3");
//         s3.printAllCar();
//         System.out.println("___________________________");
//         System.out.println("Stock 4");
//         s4.printAllCar();
//         System.out.println("___________________________");
//     }
// }
