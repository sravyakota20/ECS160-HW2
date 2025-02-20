# 01/31/2025 (Sravya Kota)
What's done:  

  - Added command to connect to db
  - Added Unit Test Cases and cleaned up unused code.
  - Made JsonParserUtility static.
  - Created PostgreSQL DB in GIT.
  - Added Git Actions for CI/CD (tests are still failing).
  - Updated .yml file to initialize PostgreSQL.
  - Updated Unit tests to initialize DB
    

# 01/30/2025 (Khang Nguyen)

What's done:  

  - Set up the PostgreSQL database and documentation on how to create tables.
  - Add code to parse replies recursively (but got an error when saving to the database).
  - Add variables to track for number of posts, number of replies per post, and longest post.

What's need to work on next:

  - Fix the error when doing parse replies (in the JsonParserUtility.java)
  - Calculate weight based on formulas.
  - Writing test cases.

# 01/29/2025 (Khang Nguyen)

What's done:  

  - Set up a hierarchy of the classes.
  - Set up JSON parser classes to parse the json input.
  - Calculate the number of words in a post.

What's need to work on next:

  - Need to parse replies iteratively.
  - Calculate weight based on formulas.
  - Set up Postgres database.

# Script for PostgreSQL:

- Create Table:
```shell
CREATE DATABASE socialmedia_db;
```
- Connect to the socialmedia_db:
```shell
\c socialmedia_db
```

```shell
CREATE TABLE posts (
id SERIAL PRIMARY KEY,
"numWords" INT DEFAULT 0
);
```

```shell
CREATE TABLE replies (
id SERIAL PRIMARY KEY,
post_id INT NOT NULL,
"numWords" INT DEFAULT 0,
"createdAt" TEXT,
FOREIGN KEY (post_id) REFERENCES posts(id) ON DELETE CASCADE
);
```



 - Empty Content for Tables:  

```shell
TRUNCATE TABLE posts RESTART IDENTITY CASCADE;
```

# Script to run Maven project (as weighted = true) in command line:

```shell
mvn clean package
mvn exec:java -Dexec.mainClass="com.ecs160.hw1.SocialMediaAnalyzerDriver" -Dexec.args="weighted=true"
```
