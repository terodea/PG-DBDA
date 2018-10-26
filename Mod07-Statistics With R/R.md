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
