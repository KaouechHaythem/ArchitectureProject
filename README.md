# Architecture Project
### developped by :  KAOUECH HAYTHEM , HELLAL MOOTAZ , SAMET RAYEN
you can find the architecture graph inside ArchitectureTP4.pdf 
## Interface : <br> 
Angular is a popular front-end web development framework that has been widely adopted in the industry. I chose to use Angular for this project because of its robust features, scalability, and ease of use. Angular provides powerful tools for building dynamic and responsive user interfaces, including advanced data binding, component-based architecture, and built-in support for HTTP requests. Additionally, Angular has a large and active community that provides a wealth of resources and support, making it easier to develop and maintain the project in the long run. Overall, Angular provides a solid foundation for building a modern, intuitive, and engaging user interface for this loan management system.

## Orchestration Service : <br>
There are several reasons why I chose to use Spring Boot for my Orchestration application. Firstly, Spring Boot is a widely used and mature Java-based framework that provides a robust set of tools and libraries for building scalable and resilient microservices. It is designed to simplify the development process by providing a pre-configured environment that includes most of the required dependencies and configurations, making it easier to set up and run the application.
<br>
Moreover, Spring Boot is well-suited for developing microservices because it provides a variety of features that allow developers to create lightweight, decoupled services that can be easily deployed and scaled. It has built-in support for creating RESTful APIs, asynchronous messaging, service discovery, and load balancing, among other things.

## Commercial Service : <br> 
Python is an ideal language for developing applications that require data processing and analysis, which is a critical component of the loan eligibility assessment process. Python provides a wide range of powerful libraries and frameworks that can be leveraged to handle large volumes of data, perform complex computations, and integrate with various external services and APIs.
<br> Moreover, Python's simplicity and ease-of-use make it a great choice for developing and testing prototypes, allowing developers to rapidly iterate and fine-tune their solutions. With its strong community support and numerous resources available online, Python provides a reliable and efficient environment for developing complex financial applications like loan eligibility assessment, making it an ideal choice for this particular application.

## Risk Management Service : <br>
I used Springboot for the same reasons as the Orchestration Service

## OCR Service : <br>
One of the best technologies to develop an OCR (Optical Character Recognition) service is Google Cloud Vision API. It provides high-quality OCR capabilities and can recognize text in various languages, including complex scripts such as Chinese and Arabic. The API can also recognize text in various formats, such as handwritten text, printed text, and text in images. It has advanced features like automatic language detection, document structure analysis, and confidence scores for text recognition. 

## Notification Service : <br> 
I would use Kafka and a pub/sub mechanism for this application <br> 
Apache Kafka is a distributed streaming platform that allows for the high-throughput, low-latency transmission of messages between applications. It is well-suited for use cases that require real-time data processing, such as notifications. Redis, on the other hand, is an in-memory data structure store that can be used as a database, cache, and message broker. It is often used as a pub/sub system, allowing for the broadcasting of messages to multiple subscribers.

## Company's Database : <br> 
I used Postgresql database to store Application Details <br>
PostgreSQL is a powerful open source relational database management system that provides a number of advantages for storing application data. First, PostgreSQL is known for its reliability and data integrity, which are important qualities when storing important information for an application. Additionally, PostgreSQL is highly scalable, meaning it can handle large amounts of data and users with ease. This makes it a good choice for applications that are expected to grow and handle high volumes of data over time.
<br>
PostgreSQL also offers a wide range of advanced features, such as support for complex queries, indexing, and built-in JSON support. These features allow developers to store and manipulate data in a variety of ways, making it a flexible and versatile database option. Finally, PostgreSQL is free and open source, meaning there are no licensing fees or restrictions on its use. Overall, these factors make PostgreSQL a strong choice for developers looking to store application data in a reliable, scalable, and feature-rich database.

## File System Database : <br>
For testing peroposes i used a local directory but in production we can use Amazon S3 <br>
There are several reasons why I chose to use Amazon S3 for storing files in my application. Firstly, S3 is a cost-effective solution for storing and managing large amounts of data. It offers a pay-as-you-go pricing model, meaning you only pay for the storage and bandwidth that you actually use. This makes it an ideal solution for startups and small businesses that want to keep their storage costs low.
<br>
Secondly, S3 provides high availability and durability of stored data. It automatically replicates data across multiple availability zones, ensuring that your data is always available and accessible. It also provides automatic backup and versioning capabilities, so you can recover previous versions of your data if needed.
<br>
Lastly, S3 provides a wide range of tools and integrations that make it easy to manage and access your stored data. It has a simple and intuitive web interface, as well as an API that allows you to integrate S3 into your application code. Additionally, S3 integrates seamlessly with other AWS services, such as EC2 and Lambda, providing a complete cloud-based infrastructure for your application.
