1. Tech Stack Chosen:
   - Framework used is Spring Boot. It allows making Rest APIs and much more while allowing modularity, maintainability and scalability by using Layered Architecture.
   - Language used is Java as it ia a platform independent andobject oriented language promoting OOPs Concepts. Also a language I have worked with since school days.
   - Database used is MySQL as it is free, opensource and highly ubiquitous. Also I have worked with it since college days.
   - API Testing tool is Old Trusted Postman Desktop Application.
     
2. Steps to run the code:
   - Clone the project repository on local computer
   - Open the project repo with IDE
   - Load the Maven Project
   - No Need to setup the Database as project will create DB itself if it is non existent.
   - Run the project.
   - Go to MySQL Workbench and use the database generated as "Database_Mini_Lead_CRM" by executing querry "use Database_Mini_Lead_CRM;".
   - To poulate the table in the database run the SQL script: "insert into leads(id,name,email,phone,source,status,created_at,updated_at) values
     (uuid(),"Anshumaan Singh","anshumaanborntolead@gmail.com","7379105000","Website","NEW",localtimestamp(),localtimestamp()),(uuid(),"Anshumaan","anshumaanborntolead@outlook.com","9559916161","Social Media","NEW",localtimestamp(),localtimestamp());".

3. API Documentation:
   - Post Request on http://localhost:8080/leads with request payload(Body) leads with allowed fields will populate the leads table in db.
   - Get Request on http://localhost:8080/leads will list the leads filtered by NEW Status.
   - Get Request on http://localhost:8080/leads/{ID} will get corresponding lead.
   - Put Request on http://localhost:8080/{ID} with request payload(Body) also will update the allowed fields of the corresponding lead.
   - Delete Request on http://localhost:8080/{ID} will delete the corresponding lead.
   - Patch Request on http://localhost:8080/{ID}/status with request payload(Body) also will transition lead to new status as per the instructions.
   - Post Request on http://localhost:8080/leads/bulk with request payload(Body) leads with allowed fields will populate the leads table in db with list of leads.

4. Design Decision:
   - Strongly believing the in concept of "The Engineer's Choice" I chose Layered Architecture for modularity, maintainability and scalability which is a must in the Agile SDLC being followed in the contemporary IT Industry.
   - Tradeoff is that code becomes bulkier because of extra snippets but advantage is that in long run it helps making efficient enterprise softwares.
   

   
