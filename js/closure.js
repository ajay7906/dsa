// function Outer(){
//     let count = 0;
//     return function Inner(){
//         count++;
//         console.log(count);
//     }
// }
// const Counter  = Outer();
// Counter();
// console.log(Counter);











// function expensiveOperation() {
//     const cache = {};
    
//     return function(n) {
//         if (n in cache) {
//             return cache[n];
//         }
//         console.log("Calculating...");
//         const result = n * n * n;
//         cache[n] = result;
//         return result;
//     };
// }

// const cubedNumber = expensiveOperation();
// console.log(cubedNumber(4));  // Calculates
// console.log(cubedNumber(4));  // Returns cached result
























function TaskManager() {
    let tasks = [];

    return {
        addTask: function(title, priority) {
            const task = {
                id: tasks.length + 1,
                title: title,
                priority: priority,
                completed: false,
                createdAt: new Date()
            };
            tasks.push(task);
            return task.id;
        },

        completeTask: function(taskId) {
            const task = tasks.find(t => t.id === taskId);
            if (task) {
                task.completed = true;
                task.completedAt = new Date();
            }
        },

        deleteTask: function(taskId) {
            tasks = tasks.filter(t => t.id !== taskId);
        },

        listTasks: function(filter = 'all') {
            switch(filter) {
                case 'completed':
                    return tasks.filter(t => t.completed);
                case 'pending':
                    return tasks.filter(t => !t.completed);
                default:
                    return tasks;
            }
        },

        getPriorityTasks: function(priority) {
            return tasks.filter(t => t.priority === priority);
        }
    };
}

// Usage demonstration
const myTasks = TaskManager();

// Adding tasks
const task1 = myTasks.addTask('Learn JavaScript Closures', 'high');
const task2 = myTasks.addTask('Build React Project', 'medium');
const task3 = myTasks.addTask('Read a Book', 'low');

// Complete a task
myTasks.completeTask(task1);

// List tasks
console.log('All Tasks:', myTasks.listTasks());
console.log('Completed Tasks:', myTasks.listTasks('completed'));
console.log('High Priority Tasks:', myTasks.getPriorityTasks('high'));