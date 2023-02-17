public class ParkingPlace {
 int numer;
 String isOccupied;


 public void toString(int numer, String isOccupied) {
  this.numer = numer;
  this.isOccupied = isOccupied;

 }

 String printPlaceInfo() {
  String info = numer + isOccupied;
  return  info;
 }


}
