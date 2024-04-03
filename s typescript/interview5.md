## 1: what is a closure
A closure gives you access to an outer function scop from an inner function
```
const createSecret = (secrete) => {
    return {
        getSecret : () => secret,
        setSecret : (newSecret) =>{
            secret = newSecret
        }
    }
}
const mySecret = createSecret("my secret");
mySecret.getSecret();

mySecret.setSecret("my new secrete");
mySecret.getSecret();



```
## 2:what is a pure function 
A pure function is a function that always produces the same output for the same input and doesn't have any side effects. 


## 3:what is compose function to produce a new function
it is the process of combining two or more function 

```
const compose = (f, g) =>(x) => f(g(x))
const g = (num) => num + 1;
const f = (num) => num * 2;

const h = compose(f,g)
h(20) // 20

```
## 4:what is functional programming
it a paradigm the uses pure function as the primary unit of composition. we can say it is paradigm where programs are built around functions. In simpler terms, it's like solving problems by breaking them down into smaller, reusable functions, rather than focusing on changing state or data directly. 


## 5:key aspect of functional programming
### immutability
- it mean d'ont change the original state but assign it to  a new one  eg thick of array function 

### higher order function
- it is a function that accept a function as argument and return new function

### avoiding sharing mutable state
- avoid changing state. thick of pure function

## 6:what is a promise
it represent the event completion or failure of an asynchronous operation

```
const promise = new Promise ((resolve, reject)=>{
    setTimeout(()=>{

        if(true){
            resolve("Success");
        }else{
            reject("error")
        }
        
    },1000)
})

promise
    .then((value)=> console.log(value))
    .catch((error)=> console.log(value))


    or

const processData = async () => {
    try{
        const data = await promise()
        console.log(data)
    }catch(error){
        console.log(error)
    }
}    

```
## 7:what is typescript
it is a superset(surensemble) of javascript developed and maintained by microsoft. it add a statics typing to js which is a dynamical typed language


## 8:what is test driven development (tdd)
it is an approach where tests are written first before actual code 
## 9:

## 10:
## 12:
## 13:
## 14:
## 15:
## 16:
## 17:
## 18:
## 19:

## 20:
## 21:
## 22:
## 23:
## 24:
## 25:
## 26:
## 27:
## 28:
## 29:

## 30:
## 31:
## 32:
## 33:
## 34:
## 35:
## 36:
## 37:
## 38:
## 39:
## 30:

## 40:
## 41:
## 42:
## 43:
## 44:
## 45:
## 46:
## 47:
## 48:
## 49:
## 40: