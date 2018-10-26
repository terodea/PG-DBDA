# R
## What is R ?
## Why R ?
- R is the leading tool for statistics, data analysis, and machine learning.
- R is open source.
- R allows to integrate with other language.
- Platform independent.
- Written in C, Fortran, and R.
- R provides command line interface.
## Extensibility Of R
- A rich collection of libraries called packages.
- If you want to add more functionality it can be extended by installing packages to your software environment.
## Programming Features of R
- Interpreted language 
- Procedure programming like caliing functions as well as OOP
- R provides a matrix approach towards handlind data like SAS.

## CRAN
- The "Comprehensive R Archive Network"(CARN) is a collection of sites which carry identical material, consisting of the R distribution(s), the contributed extensions, documentation for R, and binariers.
- CRAN Website "https://cran.rstudio.com/"

## CLI
-
    ```
        > a <- 9 # Use "Alt + -" to get assignment operator directly
        > a
        [1] 9
        > b <- 7
        > a+b
        [1] 16
        > c <- a*b
        > c
        [1] 63
        > s <- "Analytics"
        > s
        [1] "Analytics"
    ```
- s <- 9 or 9 -> a or a = 9
-
    ```
        > d <- c(1,3,56,17)
        > d
        [1] 1 3 56 17
    ```

## R Workspace
- R workspace is your current working environment
- for saving the image
    ```
        save.image("Location of saving file")
    ```
- kind of serialization.
- Loading worksapce with name "first"
    ```
        load("location of saved file")
    ```
- kind of desrialization.

## Data Types In R
- Atomic Classes
- Vector, lists
- factors
- missing values



### Atmoic Classes
- Character
    - "a","Good","Bad"
- Numeric
- Logical
    -
        ```
            j <- FALSE
            > j
            [1] FALSE
            > r > 91
            > FALSE
### Vector
- A vector can only contain objects of the same class.
- It can be created 
-
    ```
        > d <- c(1,2,3,4,5)
        > d
        [1] 1 2 3 4 5
    ```
### List
-
    ```
        > w <- list(a=90,b<- FALSE),c=c(1,2,3,4,5))
        > w[1]
        > w[3]
    ```

### Factor
- factors are used to report 
-
    ```
        w <- c("y",'n','y','y','n')
        f_w <- factor(w)
    ```
### Missing Values
- NA or NaN
- is.na() is used to test objects if they are NA.
- is.nan() is used to test for Not a number.
- A NaN value is also NA but the NA is not always NaN.
- Best example of NaN is result of zero by zero.
- Also there are functions indicating finite/ infinite values.
-
    ```
        f <- NA
        is.na(f)
        [1] TRUE
        d <- c(NA,13,17,NA,13,NA)
        is.na(d)
        [1] TRUE FALSE FALSE TRUE FALSE TRUE
    ```
-
    ```
        f <- 0
        p <- 0
        g <- f/p
        is.nan(g)
        [1] TRUE
        is.na(g)
        [1] TRUE
    ```
-
    ```
        r <- 23
        p <- 0
        e <- r/p
        is.finite(e)
        [1] FALSE
        is.infinte(e)
        [1] TRUE
    ```
### MATRIX
- Matrix can hold the dta in matrix form.
-
    ```
        mart <- matrix(10,3,2)
        mart
        mart2 <- matrix(c)
        a <-c(3,0,1,5,6,1)
        matrix(a,3,2, byrow = T)
    ```
- rbind() : binds the row
    -
        ```
            a <-1:3
            b <-5:10
            a
            [1] 1 2 3
            b
            [1] 5 6 7 8 9 10
            cb <- cbind(a,b)
            cb
            rb <-rbind(a,b)
            rb
        ```
- cbind() : binds the columns
### Array
-
    ```
        k <- array(dim=c(8))
        k
        [1] NA NA NA NA NA NA NA NA
        k[2] <- 24
        k[5] <- 90
        k
        [1] NA 24 NA NA 90 NA NA NA
    ```
-
    ```
        d <- array(dim=c(3,4))
        d
        d[2,3] <- 98
        d[3,5] <- 100
    ```
### Data Frames
- colnames : Is only for data frames kind of objects
    -
        ```
            colnames(mtcars)
        ```
    - O/P
        -   
            ```
                [1] "mpg"  "cyl"  "disp" "hp"   "drat" "wt"   "qsec" "vs"   "am"   "gear" "carb"
            ```
- names : For knowing the names of the elements of any object names() function can be used.
    -
        ```
        ```
- typeof() : For determining the type or storage mode of any object we can use "typeof()" function
-
    ```
        typeof(bollywood)
        [1] "list"
    ```
- class() : For determining the class of any object we can use "class()" function.
-
    ```
        class(bollywood)
        [1] "data.frame"
    ```
- Setting the current working directory
- setwd()

- read.table()
-
    ```
        mwm <- read.table(,skip=1)
    ```
- read.csv()
-
    ```
        mem <- read.csv("",header=F)
        colnames(mem) <-c("headerName1","headerName2") //adding column names to empty header file
    ```
- read.csv2()
- read.xlsx()
- "read.xlsx(file,sheetNo)"
    ```
        install.packages("xlsx")
        library(xlsx)
        bank <- read.xlsx("",2)
    ```
- Writing to a file
-   write.table()
    - write.table(datFrame,file)
-   write.csv()
    -write.table(datFrame,file)
- ***SUBSETTING THE DATA :- ***
- Subsetting a vector
-
    ```
        > x <- c(1,2,3,4,5,6,7,8,9,10)
        > x[1:5]
        [1] 
        > x[c(1,3,5,7,4)]
        [1] 1 3 5 7 4
        > 
    ```
- Subsetting a list
-
    ```
        f <- list(a=1:7)
    ```
- Subsetting a matrix