const fs = require('fs');
const {pipeline} = require('stream');

async function readFile(){
   
    
    try {
        const readStream = fs.createReadStream('input.txt');
        const chunks =  [];
        for await (const chunk of readStream){
            chunks.push(chunk);
        } 
        const content = Buffer.concat(chunks).toString();
        console.log(chunks);
        
    } catch (error) {
        console.error('Error:', error);
    }
} 
readFile();