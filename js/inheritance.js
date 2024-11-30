function Animal(name){
    this.name  = name;

}

Animal.prototype.eat = function(){
    console.log(`${this.name} is eating`);
    
}

function Dog(name, bread){
    Animal.call(this, name);
    this.bread = bread;
}


//inherit property from animal
Dog.prototype = Object.create(Animal.prototype);

Dog.prototype.bark = function(){
    console.log(`${this.name} is barking {${this.bread}}`);
    
}

const myDog = new Dog('Tommy', 'Golden Retriever');
myDog.bark();