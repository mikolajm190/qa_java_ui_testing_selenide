function getNumbers() {
    const num1 = parseFloat(document.getElementById('input-num1').value);
    const num2 = parseFloat(document.getElementById('input-num2').value);
    if (isNaN(num1) || isNaN(num2)) {
        return { valid: false, error: "Please enter valid numbers!" };
    }
    return { valid: true, num1, num2 };
}

function displayResult(value) {
    document.getElementById('result').innerText = value;
}

function add() {
    const { valid, num1, num2, error } = getNumbers();
    if (valid) {
        displayResult(num1 + num2);
    } else {
        displayResult(error);
    }
}

function subtract() {
    const { valid, num1, num2, error } = getNumbers();
    if (valid) {
        displayResult(num1 - num2);
    } else {
        displayResult(error);
    }
}

function multiply() {
    const { valid, num1, num2, error } = getNumbers();
    if (valid) {
        displayResult(num1 * num2);
    } else {
        displayResult(error);
    }
}

function divide() {
    const { valid, num1, num2, error } = getNumbers();
    if (valid) {
        if (num2 === 0) {
            displayResult("Cannot divide by zero!");
        } else {
            displayResult(num1 / num2);
        }
    } else {
        displayResult(error);
    }
}

function clearAll() {
    document.getElementById('input-num1').value = '';
    document.getElementById('input-num2').value = '';
    displayResult(0);
}
