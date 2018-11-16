# MongoDB Installation Steps :

STEP 1:- Create path according to MongoDB specification
-
    ```
        sudo mkdir -p /data/db
    ```
 
 STEP 2:- Give RWX Permission
 -
    ```
        sudo chmod -R 777 /data/db
    ```

STEP 3:- Download MongoDB and Extract
-
    ```
        cd Downloads
        tar xvzf mongodb-linux-x86_64-ubuntu1604-4.0.4.tgz
    ```

STEP 4:- Make Installation Path
-
    ```
        sudo mkdir -p /usr/local/mongoDB
    ```

STEP 5:- Move Extracted Files to Setup Location
- CD to extracted folder of MongoDB
    ```
        sudo mv /mongodb-linux-x86_64-ubuntu1604-4.0.4/* /usr/local/mongoDB
    ```
STEP 6:- ADD mongoDB PATH to ".bashrc"
-
    ```
        sudo gedit ~/.bashrc
    ```
- Append at the end
    ```
        export MongoDB_HOME=/usr/local/mongo
        export PATH=$PATH:/usr/local/mongo/bin
    ```


STEP 7:- START mongoDB server
- Start The MongoDB Server
    ```
        mongod
    ```
- Start MongoDB Shell
    ```
        mongo
    ```
