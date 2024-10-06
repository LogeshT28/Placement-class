process.stdin.setEncoding('utf8');

console.log("Enter a decimal number: ");

process.stdin.on('data',function(input){
    let b =parseInt(input.trim());
    let bin='';
    while(b!=0){
    let digit = b%2;
    bin = digit+bin;
    b = Math.floor(b / 2)
}
console.log(bin);
process.exit();
});



