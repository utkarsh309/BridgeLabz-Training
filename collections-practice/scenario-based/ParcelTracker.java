package scenario;

//Node class
class Node {
 String stage;
 Node next;

 Node(String stage) {
     this.stage = stage;
 }
}

public class ParcelTracker {

 Node head;

 // Create default stages
 public void createStages() {
     Node packed = new Node("Packed");
     Node shipped = new Node("Shipped");
     Node transit = new Node("In Transit");
     Node delivered = new Node("Delivered");

     packed.next = shipped;
     shipped.next = transit;
     transit.next = delivered;

     head = packed;
 }

 // Forward tracking
 public void trackParcel() {
     if (head == null) {
         System.out.println("Parcel is lost or missing!");
         return;
     }

     Node temp = head;
     while (temp != null) {
         System.out.println(temp.stage);
         temp = temp.next;
     }
 }

 // Add checkpoint after a given stage
 public void addCheckpoint(String afterStage, String newStage) {

     if (head == null) {
         System.out.println("Parcel is lost, cannot add stage.");
         return;
     }

     Node temp = head;

     while (temp != null) {
         if (temp.stage.equals(afterStage)) {
             Node newNode = new Node(newStage);
             newNode.next = temp.next;
             temp.next = newNode;
             System.out.println(newStage + " added after " + afterStage);
             return;
         }
         temp = temp.next;
     }

     System.out.println("Stage not found!");
 }

 //  lost parcel
 public void markParcelLost() {
     head = null;
 }

 public static void main(String[] args) {

     ParcelTracker tracker = new ParcelTracker();

     // Create stages
     tracker.createStages();

     System.out.println("Tracking parcel:");
     tracker.trackParcel();

     System.out.println();

     // Add custom checkpoint
     tracker.addCheckpoint("Shipped", "Reached Hub");

     System.out.println("\nTracking after adding checkpoint:");
     tracker.trackParcel();

     System.out.println();

     // Lost parcel
     tracker.markParcelLost();

     System.out.println("Tracking after parcel lost:");
     tracker.trackParcel();
 }
}
