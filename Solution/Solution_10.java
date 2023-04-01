/*Create a class namely Book to maintain Book details like id, name, quantity and author using 
  singly linked list. Perform following operations on book list: 
  a. Add book details in the begging of the list 
  b. Add book details at the end of the list 
  c. Add book detail at particular position 
  d. Remove first book detail from the list 
  e. Remove last book detail from the list 
  f. Display all book details in the list*/
import java.util.Scanner;
class Book {
    private int id;
    private String name;
    private int quantity;
    private String author;
    private Book next;
	
    public Book(int id, String name, int quantity, String author) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
        this.next = null;
		System.out.println("\nData Inserted Successfully.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book getNext() {
        return next;
    }

    public void setNext(Book next) {
        this.next = next;
    }
}


class BookList {
    private Book head;

    public BookList() {
        head = null;
    }

    public void addBookAtBeginning(int id, String name, int quantity, String author) {
        Book newBook = new Book(id, name, quantity, author);
        newBook.setNext(head);
        head = newBook;
    }

    public void addBookAtEnd(int id, String name, int quantity, String author) {
        Book newBook = new Book(id, name, quantity, author);
        if (head == null) {
            head = newBook;
        } else {
            Book current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newBook);
        }
    }

    public void addBookAtPosition(int id, String name, int quantity, String author, int position) {
        if (position == 1) {
            addBookAtBeginning(id, name, quantity, author);
        } else {
            Book newBook = new Book(id, name, quantity, author);
            Book current = head;
            int currentPosition = 1;
            while (currentPosition < position - 1 && current != null) {
                current = current.getNext();
                currentPosition++;
            }
            if (current != null) {
                newBook.setNext(current.getNext());
                current.setNext(newBook);
            } else {
                System.out.println("Invalid position");
            }
        }
    }

    public void removeFirstBook() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.getNext();
        }
    }

    public void removeLastBook() {
        if (head == null) {
            System.out.println("List is empty");
        }
		else if (head.getNext() == null) {
            head = null;
        } 
		else {
            Book current =head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			current.setNext(null);
		}
	}

	public void displayBooks() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Book current = head;
			System.out.println("-----------------------------------------------");
			while (current != null) {
				System.out.println("ID: " + current.getId() + ", Name: " + current.getName() + ", Quantity: " + current.getQuantity() + ", Author: " + current.getAuthor());
				current = current.getNext();
			}
			System.out.println("-----------------------------------------------");
		}
	}
}

public class Solution_10
{    
    public static void main(String[] args)
    {          
		int id;
		String name;
		int quantity;
		String author;
        Scanner scan = new Scanner(System.in);
		BookList bookList = new BookList();
        while (true) {
			System.out.println("\n-----------------------------------------------");
            System.out.println("\nSingly Linked List Operations\n");
			System.out.println("-----------------------------------------------");
            System.out.println("1. Insert at Begining.");
            System.out.println("2. Insert at End.");
            System.out.println("3. Insert at Position.");
            System.out.println("4. Delete from Head.");
            System.out.println("5. Delete from Tail.");
            System.out.println("6. Display Data.");  
			System.out.println("7. Exit.");
            System.out.println("-----------------------------------------------");
			System.out.print("Enter your Choice : ");
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
				System.out.print("Enter Your ID : ");
				id=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter Your Name : ");
				name=scan.nextLine();
				System.out.print("Enter Quantity of Books : ");
				quantity=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter Author Name : ");
				author=scan.nextLine();     
				bookList.addBookAtBeginning(id,name,quantity,author);
                break;                          
            case 2 : 
				System.out.print("Enter Your ID : ");
				id=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter Your Name : ");
				name=scan.nextLine();
				System.out.print("Enter Quantity of Books : ");
				quantity=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter Author Name : ");
				author=scan.nextLine();
				bookList.addBookAtEnd(id,name,quantity,author);
                break;                         
            case 3 :
				int position;
				System.out.print("Enter Position you want to Insert Record : ");
				position=scan.nextInt();
				System.out.print("Enter Your ID : ");
				id=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter Your Name : ");
				name=scan.nextLine();
				System.out.print("Enter Quantity of Books : ");
				quantity=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter Author Name : ");
				author=scan.nextLine();
                bookList.addBookAtPosition(id,name,quantity,author,position);
                break;                                          
            case 4 : 
                bookList.removeFirstBook();
				System.out.println("\nData Deleted Successfully.");
                break;
            case 5 : 
                bookList.removeLastBook();
				System.out.println("\nData Deleted Successfully.");
                break;                   
            case 6 : 
                bookList.displayBooks();
                break;  
			case 7 :
				System.out.println("Program Exited...");
				System.exit(0);
				break;
            default : 
                System.out.println("Invalid choice. Try again.");
                break;   
            }                        
        }               
    }
}
