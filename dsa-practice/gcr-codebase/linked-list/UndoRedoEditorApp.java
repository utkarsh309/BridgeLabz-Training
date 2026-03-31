package linkedList;


//Node Class
class TextState {

 // Attributes
 String content;

 // Pointers
 TextState next;
 TextState prev;

 // Constructor
 TextState(String content) {
     this.content = content;
     this.next = null;
     this.prev = null;
 }
}

//Text Editor Class
class TextEditor {

 // Head, Tail, and Current pointers
 TextState head;
 TextState tail;
 TextState current;

 // Maximum history size
 int maxSize = 10;
 int size = 0;

 // Add new text state
 public void addState(String text) {

     TextState newNode = new TextState(text);

     // If first state
     if (head == null) {
         head = tail = current = newNode;
         size++;
         return;
     }

     // Remove redo history
     if (current.next != null) {
         current.next.prev = null;
         current.next = null;
         tail = current;
     }

     // Add new state at end
     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
     current = newNode;
     size++;

     // Maintain fixed history size
     if (size > maxSize) {
         head = head.next;
         head.prev = null;
         size--;
     }
 }

 // Undo operation
 public void undo() {

     if (current == null || current.prev == null) {
         System.out.println("Nothing to undo");
         return;
     }

     current = current.prev;
 }

 // Redo operation
 public void redo() {

     if (current == null || current.next == null) {
         System.out.println("Nothing to redo");
         return;
     }

     current = current.next;
 }

 // Display current text
 public void displayCurrentState() {

     if (current == null) {
         System.out.println("Editor is empty");
     } else {
         System.out.println("Current Text: " + current.content);
     }
 }
}

//Main Class
public class UndoRedoEditorApp {

 public static void main(String[] args) {

     TextEditor editor = new TextEditor();

     editor.addState("Hello");
     editor.displayCurrentState();

     editor.addState("Hello World");
     editor.displayCurrentState();

     editor.addState("Hello World!");
     editor.displayCurrentState();

     editor.undo();
     editor.displayCurrentState();

     editor.undo();
     editor.displayCurrentState();

     editor.redo();
     editor.displayCurrentState();

     editor.addState("Hello Java");
     editor.displayCurrentState();

     editor.redo(); // No redo possible
 }
}
