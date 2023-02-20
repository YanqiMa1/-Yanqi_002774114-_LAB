/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import Author.AuthorDirectory;
import Books.BookDirectory;
import Customer.CustomerDirectory;
import Genre.GenreDirectory;
import Services.RequestDirectory;

/**
 *
 * @author Ma2017
 */
public class Library {
    
    private UserAccountDirectory useraccountDirectory;
    private AuthorDirectory authorDirectory;
    private BookDirectory bookDirectory;
    private CustomerDirectory customerDirectory;
    private GenreDirectory genreDirectory;
    private RequestDirectory requestDirectory;
    
    public Library() {
        this.useraccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.genreDirectory = new GenreDirectory();
        this.bookDirectory = new BookDirectory();
        this.requestDirectory = new RequestDirectory();
        
        
        // create a sys admin here
        UserAccount user1 = this.useraccountDirectory.createUserAccount("admin", "admin", "System admin");
        //create a librarian here
        UserAccount user2 = this.useraccountDirectory.createUserAccount("librarian", "librarian", "Librarian");
        
    }
    
    public static Library getLibraryInstance() {
        
        return new Library();
    }

    public UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
    }

    public RequestDirectory getRequestDirectory() {
        return requestDirectory;
    }

    public void setRequestDirectory(RequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
    }

    
}
