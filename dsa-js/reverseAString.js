// ***********************************************
//Using the recursion
// ***********************************************
function reverse1(str){
    //terminating condition
    if(!str){
        return '';
    }
    //recursive call
    return reverse1(str.substr(1)) + str[0];

}
console.log(reverse1('Adeleke'));

// ***********************************************
// Using a Stack 
// ***********************************************


//Reversing a string with a Stack
function reverse2 (str){
    let reversedString ='';

    //Convert the string to an array first.
    const strArray = str.split(''); // convert a string to an array.
  //const strArry = [...str];    ---> also convert string to an arryay.
    
   while(strArray.length){
        reversedString += strArray.pop();
   }
   return reversedString;
}
console.log(reverse2('Adeleke'));


// ***********************************************
// Using in-built Functions 
// ***********************************************
 
function reverseInBuilt (str){
    
   //return str.split('').reverse().join('');      OR
   return [...str].reverse().join('');
}
console.log(reverseInBuilt('inBuilt'));

// ***********************************************
    // For Loop has 4 different implementations.
// ***********************************************


//Reversing a string with a For Loop
function reverse3 (str){
    let reversedString ='';

    for( let i = 0 ; i < str.length; i++){
        reversedString = str[i] + reversedString;
    }
    return reversedString;
}
console.log(reverse3('Adeleke'));


// ***********************************************


//Reversing a string with a Reversed For Loop
function reverse4 (str){
    let reversedString ='';

    for( let i = str.length -1 ; i >= 0 ; i-- ){
        reversedString += str[i];
    }
    return reversedString;
}
console.log(reverse4('Adeleke'));


// ***********************************************

//Reversing a string with a ForEach Loop
function reverse5 (str){
    let reversedString ='';

    for( let char of str){
        reversedString = char + reversedString;
    }
    return reversedString;
}
console.log(reverse5('Adeleke'));



// ***********************************************


//Reversing a string with a For Loop (With calcualted index + order changed)
function reverse6 (str){
    let reversedString ='';

    for( let i = 0 ; i < str.length; i++){
        reversedString += str[str.length - 1 - i];
    }
    return reversedString;
}
console.log(reverse6('Adeleke'));


// ***********************************************

/*
Reversing a string with a reduce function
function reverse3(str){ 
    return str.split('').reduce((acc , char) => char + acc, '');
}

onsole.log(reverse3('Adeleke'));
*/

