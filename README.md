# restassured-testng
This is a sample api testing framework using  rest assured and testNg

## What is API?
    An application Programming interface (API) is a way for two or more computer programmers can communicate with each 
    other. The term API is often used to refer to web APIs,[2] which allow communication between computers that are 
    joined by the internet.  
    In building applications, an API simplifies programming by abstracting the underlying implementation and
    only exposing objects or actions the developer needs.

## End point: 
    Address where API is hosted on the Server.

## HTTP Methods
    HTTP methods which are commonly used to communicate with Rest API’s are
### GET:
    The GET method is used to extract information from the given server using a given URI. 
    While using GET request, it should only extract data and should have no other effect on the data. 
    No Payload/Body required
    **How to send input data in GET?**
    Ans: Using Query Parameters

### POST: 
    A POST request is used to send data to the server, for example, customer information, file upload, etc. 
    using HTML forms.
    **How to send input data in POST?**
    Ans: Using Form Parameters /Body Payload
### Put:
    Replaces all current representations of the target resource with the uploaded content.
### DELETE:
    Removes all current representations of the target resource given by a URI.

#### Resources:
    Resources represent API/Collection which can be accessed from the Server
#### Path Parameters:
    Path parameters are variable parts of a URL path. 
    They are typically used to point to a specific resource within a collection, such as a user identified by ID
    https://amazon.com/orders/112
    https://www.google.com/search?q=newyork&oq=newyork&aqs=chrome..69i57j0l7.2501j0j7&sourceid=chrome&ie=UTF-8

#### Query Parameters:
    Query Parameter is used to sort/filter the resources.
    Query Parameters are identified with?””
    https://amazon.com/orders?sort_by=2/20/2020

#### Headers/Cookies:
    Headers represent the meta-data associated with the API request and response. 
    In layman terms, we were sending Additional details to API to process our request.
    Example : Authorization details
**End Point Request URL can be constructed as below
Base URL/resource/(Query/Path)Parameters**

    