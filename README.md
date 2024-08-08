# Maids.cc
Library Management System API
This project aims to develop a robust Library Management System API using Spring Boot. The system facilitates librarians in efficiently managing books, patrons, and borrowing records.


*******************Features*******************

Manage books, patrons, and borrowing records

RESTful API endpoints

CRUD operations

Validation and error handling

Unit and integration tests


*************Technologies Used*************

Java

Spring Boot

Spring Data JPA

H2 database

Spring Validation

*************Installation*************
Clone the repository:    *https://github.com/MhmdAdnan/Maids.cc*


*************How to use REST API*************



 *************OPEN POSTMAN*************
        
*************Book management endpoints*************




● GET /api/books: Retrieve a list of all books.


● GET /api/books/{id}: Retrieve details of a specific book by ID.


● POST /api/books: Add a new book to the library.


● PUT /api/books/{id}: Update an existing book's information.


● DELETE /api/books/{id}: Remove a book from the library.


*************Patron management endpoints*************



● GET /api/patrons: Retrieve a list of all patrons.


● GET /api/patrons/{id}: Retrieve details of a specific patron by ID.


● POST /api/patrons: Add a new patron to the system.


● PUT /api/patrons/{id}: Update an existing patron's information.


● DELETE /api/patrons/{id}: Remove a patron from the system.


*************Borrowing endpoints*************



● POST /api/borrow/{bookId}/patron/{patronId}: Allow a patron to
borrow a book.


● PUT /api/return/{bookId}/patron/{patronId}: Record the return of a borrowed book by a patron.


