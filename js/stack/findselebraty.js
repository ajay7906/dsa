//find celebray using the brute force method
// Time complexity: O(n^2)
// Space complexity: O(1)
function findCelebrity(n, martix){
    for(let i= 0; i<n; i++){
        let isCelebrity = true;
        for(let j=0; j<n; j++ ){
            if(martix[i][j] === 1){
                isCelebrity = false;
                break;
            }
        }
        if (!isCelebrity) continue;
        //check if i knows anyone
        for(let j=0; j<n; j++){
            if(i !== j && martix[j][i] === 0){
                isCelebrity = false;
                break;
            }
        }
        if (isCelebrity) return i;
    }
    return -1;
}

const matrix = [
    [0, 0, 1, 0],
    [0, 0, 1, 0],
    [0, 0, 0, 0],
    [0, 0, 1, 0]
];  
const n = 4;
const result = findCelebrity(n, matrix); 


