package linkedList;

//Node Class
class Node{
	
	//Attributes
	int rollNumber;
	String name;
	int age;
	char grade;
	
	//next pointer
	Node next;
	
	Node(int rollNumber,String name,int age,char grade){
		this.rollNumber=rollNumber;
		this.name=name;
		this.age=age;
		this.grade=grade;
		this.next=null;
	}
}

class Student{
	
	//Head Pointer
	Node head;
	
	//Method to insert at beginning
	public void insertAtBeginning(int rollNumber,String name,int age,char grade) {
		
		Node newNode=new Node(rollNumber,name,age,grade);
		
		newNode.next=head;
		head=newNode;
	}
	
	//Method to insert at end
	public void insertAtEnd(int rollNumber,String name,int age,char grade) {
		
		Node newNode=new Node(rollNumber,name,age,grade);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next=newNode;
	}
	
	//Method to insert at specific position
	public void insertAtPosition(int rollNumber,String name,int age,char grade,int position) {
		
		if(position==1) {
			insertAtBeginning(rollNumber,name,age,grade);
			return;
		}
		
		Node newNode=new Node(rollNumber,name,age,grade);
		Node temp=head;
		
		for(int i=1;i<position-1 &&temp!=null;i++) {
			temp=temp.next;
		}
		
		if(temp==null) {
			System.out.println("Invalid Position");
			return;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	//Method to delete a record by roll number
	public void deleteByRollNumber(int rollNo) {
		
		if(head==null) {
			System.out.println("No Student in the List");
			return;
		}
		
		if(head.rollNumber==rollNo) {
			head=head.next;
			return;
		}
		
		Node temp=head;
		
		while(temp.next!=null && temp.next.rollNumber!=rollNo) {
			temp=temp.next;
		}
		
		if(temp.next==null) {
			System.out.println("Student Not Found");
		}else {
			temp.next=temp.next.next;
			System.out.println("Deleted");
		}
		
	}
	
	//Method to search the student by roll number
	public void searchByRollNumber(int rollNo) {
		
		if(head==null) {
			System.out.println("No Student in the List");
			return;
		}
		
		Node temp=head;
		
		while(temp!=null) {
			if(temp.rollNumber==rollNo) {
				System.out.println("Student found");
				displayStudent(temp);
				return;
			}
			temp=temp.next;
		}
		
		System.out.println("Student not found");
	}
	
	//Method to display student
	public void displayStudent(Node node) {
		
		System.out.println("Roll Number: "+node.rollNumber);
		System.out.println("Name: "+node.name);
		System.out.println("Age: "+node.age);
		System.out.println("Grade: "+node.grade);
	}
	
	//Method to display all student
	public void displayAllStudent() {
		
		if(head==null) {
			System.out.println("No student");
			return;
		}
		
		Node temp=head;
		while(temp!=null) {
			
			displayStudent(temp);
			System.out.println();
			temp=temp.next;
		}
	}
	
	//Method to update Student grade by roll number
	public void updateGradeByRollNumber(int rollNo,char newGrade) {
		
		Node temp=head;
		
		while(temp!=null) {
			
			if(temp.rollNumber==rollNo) {
				temp.grade=newGrade;
				System.out.println("Grade Updated Successfully");
				return;
			}
			temp=temp.next;
		}
		System.out.println("Student Not found");
	}
}

//Main Class
public class StudentClassManagement {

	public static void main(String[] args) {
		
		Student list=new Student();
		
		//Operations
		list.insertAtBeginning(1,"Ram",23,'A');
		list.insertAtBeginning(2,"Aditya",22,'A');
		list.insertAtEnd(3,"Sumit",24,'B');
		list.insertAtPosition(4,"Utkarsh",24,'A',3);
//		list.displayAllStudent();
		
//		list.searchByRollNumber(4);
		list.deleteByRollNumber(2);
//		list.displayAllStudent();
		
		list.updateGradeByRollNumber(3, 'O');
		list.displayAllStudent();
		
		
		
	}

}
