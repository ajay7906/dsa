function checkAnagram(str1, str2){
    let stack = [];
    if(str1.length !== str2.length){
        return false;
    }
    for(let i = 0; i < str1.length; i++){
        stack.push(str1[i]);

    }
    for(let i = 0; i < str2.length; i++){
        if(!stack.includes(str2[i])){
            return false;
        }
    }
    return true;
}

const str1 = "listen";
const str2 = "silent";
console.log(checkAnagram(str1, str2));





