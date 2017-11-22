# Project Introduction
This project was meant as exercice for integrating Angular 4 with spring boot.

This exercice is divided into two parts: 
1. The **frontend** which is written in Java using the [SpringBoot](https://projects.spring.io/spring-boot/) framwork.
2. The **backend** which is written in typescript and uses the [Angular](https://angular.io) 4 framework. 

The project is a simple e-commerce website that is used to sell robots online. The functionlaity of the store is limited to the following:
- List product categories. Example Cleaning, indestrial robots or what have you.
- The ability to list, add, delete robots. `The update functionality has not been implemented.`
- Login is required in order to delete or add a new product.
- Robot browsing does not require authentication.

Here is a screen print that shows the landing page of the application

![](https://github.com/osenouci/robotStoreExpressServer/blob/master/screenshots/home.png)

# Project repositories and demo 
The project is divided into two layers, **`frontend`** and **`backend`**. There exists a Github repo for each of the layers and an additional one for a Node Express server that has been used to serve the frontend on the heroku cloud.

### 1. Backend API - Spring Boot based.
- Github repo -> (The repo you are currently visiting)
- [Heroku demo] (https://peaceful-ravine-78348.herokuapp.com)

### 2. Frontend (single page application) - Angular 4 based.
- [Angular app Github repo](https://github.com/osenouci/robotStoreAngularUI)
- [Express server Github repo](https://github.com/osenouci/robotStoreExpressServer)
- [Heroku demo] (https://shielded-hollows-40663.herokuapp.com)


> Please visit the other repos for information about their code. 

# API file structure
TST has been used to create the backend as a **Maven** project. The project has the following structure:

```
.
+-- lu.innoviction
|   +-- RobotStoreApplication.java              // Application entry point
+-- lu.innoviction.configuration
|   +-- CORSFilter.java                         // Allows cross browser requests
|   +-- GlobalDefaultExceptionHandler.java      // Used to catch validation exceptions and output user friendly msgs.
|   +-- SecurityConfig.java                     // Used to define authentication rules and adds a login test account.
+-- lu.innoviction.controller                // contains Rest Controllers          
|   +-- ApplicationController.java              // Base controller
|   +-- CategoryController.java                 // Lists the categories as Data Transfer Objects
|   +-- RobotController.java                    // Used for listing, adding and removing robotos.
|   +-- UserController.java                     // Contains a single method used to mimic the user login process.
+-- lu.innoviction.model                     // Used to define entities
|   +-- Category.java                           // A category can have 0 or (n) robotos
|   +-- Photo.java                              // A robot can have 0 or (n) photos.
|   +-- Robot.java                              // A Robot belongs to single category & has several photos
+-- lu.innoviction.model.dto                 // Data transfer model using to hide, format and validate properties.
|   +-- CategoryDTO.java                        // Used for listing the categories instead of exposing the model.
|   +-- DataTransferObject.java                 // Base class extends serlizable.
|   +-- PhotoDTO.java                           // Used for validation and displaying in details.
|   +-- RobotDTO.java                           // Used for validation and displaying in details.
|   +-- RobotLightDTO.java                      // Used when we list robots. Contains a single photo instead of several.
+-- lu.innoviction.repository                // Standard GRUD repositories
|   +-- CategoryRepository.java                 // Does not extra code.
|   +-- PhotoRepository.java                    // Contains method signature used to find robots by category id.
+-- lu.innoviction.response                  // Used to format the response
|   +-- APIResponse.java                        // Defines the response as {status:boolean, data:any, error:[]|string}
|   +-- Error.java                              // Defines how errors should be formatted {field:string, message:string}
+-- lu.innoviction.service                   // Injectable services
|   +-- CategoryService.service                 // Carry out operations on the category grud repo
|   +-- RobotService.java                       // Carry out operations on the robot grud repo
+-- lu.innoviction.validation                // Define validation annotations
|   +-- URL.java                                // Defines the annotation interface
|   +-- URLValidator.java                       // Defines the implementation
```

# Application routes
The application has two sets of routes that are used to carry out GRUD operations on the robots and the categories
## Categories
 We can only list the categories.
 - GET /category
## Robotos
We can perfom insertion, listing and DELETION operations on the robotos. The delete and post methods are protected using basic authentication described in the next section.
 ##### Public routes
 - GET /robot
 - GET /robot/{id}
 - GET /robot/category/{id}"
 ##### Protected routes
 - POST /robot/{id}
 - DELETE /robot/{id} 
# Authentication
The API uses Basic authentication to authenticate users.

#### So what is basic authentication?
> Basic authentication is a simple authentication scheme built into the HTTP protocol. The client sends HTTP requests with the Authorization header that contains the word Basic word followed by a space and a base64-encoded string username:password. For example, to authorize as demo / p@55w0rd the client would send:
Authorization: Basic ZGVtbzpwQDU1dzByZA==

`Note: Because base64 is easily decoded, Basic authentication should only be used together with other security mechanisms such as HTTPS/SSL.`

[More information about basic authentication](https://swagger.io/docs/specification/authentication/basic-authentication/)


#### How to access the protected routes?
The test account users ***username*** and ***password*** as credentials. The credentials need to be formatted as follows ***username:password*** and finally encode them using base64 encoding.

Finally we need to pass them to the server as header using the key ***Authorization***

Example:
```
Authorization:Basic dXNlcjpwYXNzd29yZA==
```
