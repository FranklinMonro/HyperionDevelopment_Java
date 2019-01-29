import java.sql.*;//import java module
import java.util.*;//import java module
public class Library {

	public static void main(String[] args) throws SQLException {
		System.out.println(//output to user for different options
				  "1.Enter Book\n"
				+ "2.Update Book\n"
				+ "3.Delete Books\n"
				+ "4.Search Books\n"
				+ "0.Exit");
		Scanner input = new Scanner(System.in);//create scanner for input from user
		System.out.println("\nPlease Enter a option");
		int userOptions = input.nextInt();//get user input
		
		
			if(userOptions == 1) {//if statement to use enter book method
				enterBook();
				}else if(userOptions == 2) {//else if to use update method
					updateBook();
				}else if(userOptions == 3) {//else if to use delete method
					deleteBook();
				}else if(userOptions == 4) {//else if to use search method
					searchBook();
				}else if(userOptions == 0) {//else if to exit
					System.out.println("Exit of program");
				}else {//else statement if incorrect option is chosem
					System.out.println("Sorry that option does not exist, exit of program");
				}

			input.close();	//close of input
	}
	
	
	
	public static String enterBook() throws SQLException {//method to enter new book into SQL database	
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_task_7?useSSL=False", "myuser", "myuser");//connection to sql database
		Statement stmt = conn.createStatement();//create a variable for statement
		
		Scanner input = new Scanner(System.in);//create input for user

		System.out.println("Please enter the Book title");//output for user
		String bookTitle = input.nextLine();//create a variable to store book title
		System.out.println("Please enter the Author of the book");//output for user
		String bookAuthor = input.nextLine();//variable to store book's author
		System.out.print("Please enter a Book ID");//output for user
		int bookID = input.nextInt();//variable to store book ID
		System.out.println("How many are in stock");//output for user
		int bookStock = input.nextInt();//variable to store stock of book
		
		String sqlInsert = "insert into library " + "values (" + bookID + ", " + "'" + bookTitle + "'" + ", " + "'" + bookAuthor + "'" + ", " + bookStock + ")";//variable to store sql query
		System.out.println("The SQL query is: " + sqlInsert);//output for user    
		int countInserted = stmt.executeUpdate(sqlInsert);//variable to store sql statement
		String statement = countInserted + " records inserted.\n";//output for user
		
		input.close();//close of input
		
		return statement;//return of string statement
	}
	
	public static String updateBook() throws SQLException {//method to update book book in SQL database	
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_task_7?useSSL=False", "myuser", "myuser");//connection to sql database
		Statement stmt = conn.createStatement();//create a variable for statement
		
		Scanner input = new Scanner(System.in);//create input for user
		
		System.out.println("Pick Book ID to update book");//output for user
		int pickBookID = input.nextInt();//input from user
		
		System.out.println("What do you want to update");//output for user
		System.out.println("1.Book ID\n"//output for user
				+ "2.Book Title\n"
				+ "3.Book Author\n"
				+ "4.Book Stock\n");
		int updateOption = input.nextInt();//create variable to store option from user
		
		if(updateOption == 1) {//if statement to change Book ID in sql query
			System.out.println("What is the new Book ID");//output for user
			int newBookID = input.nextInt();//variable to store new book id
			
		
			String strUpdate = "update library set id=" + newBookID + " where id=" + pickBookID;//variable to store sql query
			System.out.println("The SQL query is: " + strUpdate);//output for user
			int countUpdated = stmt.executeUpdate(strUpdate);//variable to store of sql statement
			System.out.println(countUpdated + " records affected.");//output for user
			
			String strSelect = "select * from library where id=" + newBookID;//variable to store sql query
			System.out.println("The SQL query is: " + strSelect);//output for user
			ResultSet rset = stmt.executeQuery(strSelect);//variable to store sql statement
			while(rset.next()) {//while loop to go through all keys in table also close connection to database
				System.out.println(rset.getInt("id") + ", " + rset.getString("title") + ", " + rset.getString("author") + ", " + rset.getInt("qty"));//output of changes
			}			
		}else if(updateOption == 2) {// else if statement to change book title
			Scanner input2 = new Scanner(System.in);
			System.out.println("What is the Book's new Title");
			String newBookTitle = input2.nextLine();

			String strUpdate = "update library set title=" + "'" + newBookTitle + "'" + " where id=" + pickBookID;//modified line
			System.out.println("The SQL query is: " + strUpdate);
			int countUpdated = stmt.executeUpdate(strUpdate);
			System.out.println(countUpdated + " records affected.");
			
			String strSelect = "select * from library where id=" + pickBookID;//modified line
			System.out.println("The SQL query is: " + strSelect);
			ResultSet rset = stmt.executeQuery(strSelect);
			while(rset.next()) {
				System.out.println(rset.getInt("id") + ", " + rset.getString("title") + ", " + rset.getString("author") + ", " + rset.getInt("qty"));
			}
			input2.close();
		}else if(updateOption == 3) {//else if statement to change to author's name
			Scanner input2 = new Scanner(System.in);
			System.out.println("Who is the Book's Author");
			String newBookAuthor = input2.nextLine();

			String strUpdate = "update library set author=" + "'" + newBookAuthor + "'" + " where id=" + pickBookID;//modified line
			System.out.println("The SQL query is: " + strUpdate);
			int countUpdated = stmt.executeUpdate(strUpdate);
			System.out.println(countUpdated + " records affected.");
			
			String strSelect = "select * from library where id=" + pickBookID;//modified line
			System.out.println("The SQL query is: " + strSelect);
			ResultSet rset = stmt.executeQuery(strSelect);
			while(rset.next()) {
				System.out.println(rset.getInt("id") + ", " + rset.getString("title") + ", " + rset.getString("author") + ", " + rset.getInt("qty"));
			}
			input2.close();
		}else if(updateOption == 4) {//else if statement to change stock 
			
			System.out.println("What is the Book's new Stock");
			int newBookStock = input.nextInt();

			String strUpdate = "update library set qty=" + newBookStock + " where id=" + pickBookID;//modified line
			System.out.println("The SQL query is: " + strUpdate);
			int countUpdated = stmt.executeUpdate(strUpdate);
			System.out.println(countUpdated + " records affected.");
			
			String strSelect = "select * from library where id=" + pickBookID;//modified line
			System.out.println("The SQL query is: " + strSelect);
			ResultSet rset = stmt.executeQuery(strSelect);
			while(rset.next()) {
				System.out.println(rset.getInt("id") + ", " + rset.getString("title") + ", " + rset.getString("author") + ", " + rset.getInt("qty"));
			}
			}else {
				System.out.println("Sorry that selection is not on the list");
			
		}
		input.close();
		return null;
	}
	
	public static String deleteBook() throws SQLException {//method to delete book from SQL database	
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_task_7?useSSL=False", "myuser", "myuser");//connection to sql database
		Statement stmt = conn.createStatement();//create a variable for statement
		
		Scanner input = new Scanner(System.in);//create input for user
		
		System.out.println("Pick Book ID to DELETE");//output for user
		int pickBookID = input.nextInt();//input from user
		
		String sqlDelete = "delete from library where id=" + pickBookID;//modified line
		System.out.println("The SQL query is: " + sqlDelete);
		int countDeleted = stmt.executeUpdate(sqlDelete);
		input.close();
		return countDeleted + " records deleted.\n";
	}
	
	public static String searchBook() throws SQLException {	//method to search all entry in SQL database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_task_7?useSSL=False", "myuser", "myuser");//connection to sql database
		Statement stmt = conn.createStatement();//create a variable for statement
		
		String strSelect = "select * from library";//variable to store SQL query
		System.out.println("The SQL query is: " + strSelect);//output for user
		ResultSet rset = stmt.executeQuery(strSelect);//variable to store SQL statement
		
		while(rset.next()) {//while loop to get all entries in SQL database also close connection
			System.out.println(rset.getInt("id") + ", " + rset.getString("title") + ", " + rset.getString("author") + ", " + rset.getInt("qty"));//output for user
		}
		return null;//return statement
	}
}
