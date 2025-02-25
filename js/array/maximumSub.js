let  arr = [2, 4, 5, 6, 2, 6];

function Queue(size  = null) {
    const queueElements = [];

    const peek = () => {
        if (queueElements.length) {
            return queueElements[0];
        }

        return null;
    }

    const pop = () => {
        if (queueElements.length) {
            return queueElements.shift();
        }

        return null;
    }

    const push = (element) => {
        if (size && queueElements.length >= size) {
            return
        }

        queueElements.push(element);
    }

    const isEmpty = () => {
        return queueElements.length == 0;
    }

    const queueSize = () => {
        return queueElements.length;
    }

    return {
        pop, // O(n)
        push, // 1
        size: queueSize,
        isEmpty,
        peek
    }
}

const q = Queue(2);

q.push(1);
q.push(2);
q.push(3);
q.push(4);
q.push(5);

console.log("Peek Element: ", q.peek()) // 1
console.log("Poped last element: ", q.pop()) // 1

console.log("Peek element: ", q.peek()) // 2

console.log("Queue Size:", q.size()) // 4
console.log("Is Queue empty: ", q.isEmpty()) // false