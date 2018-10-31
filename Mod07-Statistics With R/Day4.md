# Day 4

## Geometric Distribution
- Two possible outcomes - Succcess and failure
- <a href="https://www.codecogs.com/eqnedit.php?latex=q^{n-1}&space;p" target="_blank"><img src="https://latex.codecogs.com/gif.latex?q^{n-1}&space;p" title="q^{n-1} p" /></a>
- Mean and Variance
    - Mean
        - <a href="https://www.codecogs.com/eqnedit.php?latex=\mu&space;=&space;\frac{1}{p}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\mu&space;=&space;\frac{1}{p}" title="\mu = \frac{1}{p}" /></a>
    - Variance
        - <a href="https://www.codecogs.com/eqnedit.php?latex=\sigma&space;^{2}&space;=&space;\frac{(1-p)}{p^{2}}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\sigma&space;^{2}&space;=&space;\frac{(1-p)}{p^{2}}" title="\sigma ^{2} = \frac{(1-p)}{p^{2}}" /></a>

## Negative Binomial Distribution

## Exponential Distribution
-
- The exponenatial distribution has the desnity function
    - <a href="https://www.codecogs.com/eqnedit.php?latex=f(x)&space;=&space;\lambda&space;e^{-\lambda&space;x}&space;for&space;x\geq&space;0" target="_blank"><img src="https://latex.codecogs.com/gif.latex?f(x)&space;=&space;\lambda&space;e^{-\lambda&space;x}&space;for&space;x\geq&space;0" title="f(x) = \lambda e^{-\lambda x} for x\geq 0" /></a>
- Mean
    - <a href="https://www.codecogs.com/eqnedit.php?latex=E(x)&space;=&space;\frac{1}{\lambda}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?E(x)&space;=&space;\frac{1}{\lambda}" title="E(x) = \frac{1}{\lambda}" /></a>
- Variance
    - <a href="https://www.codecogs.com/eqnedit.php?latex=Var(x)&space;=&space;\frac{1}{\lambda^{2}}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?Var(x)&space;=&space;\frac{1}{\lambda^{2}}" title="Var(x) = \frac{1}{\lambda^{2}}" /></a>

## Statistical Inference

### Independence Of Variable

### Identitcally Distribuited Variable

### Law Of Large Numbers

### Sampling Distributions

## Central Limit Theorem
- The CLT states that the sampling distribution of the mean of any independent, random variable will be normal or nearly normal, if the sample size is large enough.
- In practice, some statistics practitioners say that a sample size of 30 is large enough for the population distribution o be roughly bell-shaped.
- Hence, we can state population parameters for distribution of means as :
    - <a href="https://www.codecogs.com/eqnedit.php?latex=E(x)&space;=&space;\mu" target="_blank"><img src="https://latex.codecogs.com/gif.latex?E(x)&space;=&space;\mu" title="E(x) = \mu" /></a>
    - <a href="https://www.codecogs.com/eqnedit.php?latex=Var(x)&space;=&space;\frac{\sigma^2&space;}{n}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?Var(x)&space;=&space;\frac{\sigma^2&space;}{n}" title="Var(x) = \frac{\sigma^2 }{n}" /></a>

    -
        ```
            size <- 2000
            h<- array(dim=c(50,size))
        ```
## ESTIMATE TERMINOLOGY
### Point Estimate