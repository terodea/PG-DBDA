## Vectorization : 
-
    ```
        g <- c(0,1,2,3,4,5,6,9,0)
        d <- ifelse(g > 0,"A","B")
    ```
-
    ```
        g <- c(0,1,2,3,4,5,6,9,0)
        r <- array("NA",length(g))
        for(i in 1:length(g)){
            if(g[i]>0){
                r[i] <- "A"
            }
            else{
                r[i] <- "B"
            }
        }
    ```
- How to take mean,var or sd if the values have NA in them.
    ```
        g <- c(0,2,3,"NA")
        mean(g,na.rm = T)
        var(g,na.rm = T)
        sd(g,na.rm = T)
    ```
- ***summary()*** : Summary is a generic function. It behaves like an overloaded function.
-
    ```
        summary(items$Price)
    ```
-
    ```
        g <- c(0,2,3,"NA")
        summary(g)
    ```
    - O/P :
        ```
        ```
-
    ```
        h <- c("S","T","S","T",'S','T','S','T')
        f_h <- factor(h)
        summary(f_h)
    ```
    - O/P :
        ```
            S T 
            4 4
        ```
- ***attach()*** : You can avoid writin $.Used only when your handling one dataframe at a time.
-
    ```
        data("mtcars")
        summary(mtcars$mpg)
    ```
-
    ```
        attach(mtcars)
        summary(mpg)
    ```
    - detach(mrtcars) : Used to undo attach.
- ***Creating Functions ***:
-
    ```
        Function-Name <- function(arguement-list){
            statements
        }
    ```
-
    ```
        add <- function(a,b,c){
            return(a+b+C)
        }
    ```

- ***sapply()*** :
- Function sapply() tries to simplify the result of the function lappyly()
- Syntax :
    ```
        sapply(list,function)
    ```
- Where :
    - list : A list object.If it is not a list then it be coerced to a list using as.list
    - fucntion : Function to be applied on each element in the list.
- If result is list where every element is of length=1, then it return a vector.
- If result is list where every element is a vector of same length(>1), then it return matirx.
- In case if nothing of result can be figured out, the it returns list.