import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManagementSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
List<Vehicle> vehicles = new ArrayList<>();

while (true) {
System.out.println("1. Add Vehicle");
System.out.println("2. List Vehicles");
System.out.println("3. Search for Vehicle by License Plate");
System.out.println("4. Exit");

int choice = scanner.nextInt();
scanner.nextLine(); // Consume newline

switch (choice) {
case 1:
System.out.print("Enter Make: ");
String make = scanner.nextLine();
System.out.print("Enter Model: ");
String model = scanner.nextLine();
System.out.print("Enter Year: ");
int year = scanner.nextInt();
scanner.nextLine(); // Consume newline
System.out.print("Enter License Plate: ");
String licensePlate = scanner.nextLine();

Vehicle vehicle = new Vehicle(make, model, year, licensePlate);
vehicles.add(vehicle);
System.out.println("Vehicle added successfully.");
break;
case 2:
System.out.println("List of Vehicles:");
for (Vehicle v : vehicles) {
System.out.println(v);
}
break;
case 3:
System.out.print("Enter License Plate to Search: ");
String searchPlate = scanner.nextLine();
boolean found = false;

for (Vehicle v : vehicles) {
if (v.getLicensePlate().equals(searchPlate)) {
System.out.println("Vehicle found:");
System.out.println(v);
found = true;
break;
}
}

if (!found) {
System.out.println("Vehicle with license plate " + searchPlate + " not found.");
}
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Invalid choice");
}
}
}
}

class Vehicle {
private String make;
private String model;
private int year;
private String licensePlate;

public Vehicle(String make, String model, int year, String licensePlate) {
this.make = make;
this.model = model;
this.year = year;
this.licensePlate = licensePlate;
}

public String getMake() {
return make;
}

public String getModel() {
return model;
}

public int getYear() {
return year;
}

public String getLicensePlate() {
return licensePlate;
}

@Override
public String toString() {
return "Make: " + make + ", Model: " + model + ", Year: " + year + ", License Plate: " + licensePlate;
}
}
