fun main() {
    println("Welcome to the  Calculator!")
    println("===============================")

    while (true) {
        println("\nSelect operation:")
        println("1. Add")
        println("2. Subtract")
        println("3. Multiply")
        println("4. Divide")
        println("5. Exit")

        print("Enter choice (1/2/3/4/5): ")
        val choice = readLine()?.toIntOrNull()

        if (choice == null || choice !in 1..5) {
            println("Invalid choice. Please select a valid operation (1/2/3/4/5).")
            continue
        }

        if (choice == 5) {
            println("Exiting... Thank you for using the  Calculator!")
            break
        }

        print("Enter first number: ")
        val num1 = readLine()?.toDoubleOrNull()

        if (num1 == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }

        print("Enter second number: ")
        val num2 = readLine()?.toDoubleOrNull()

        if (num2 == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }

        val result = when (choice) {
            1 -> num1 + num2
            2 -> num1 - num2
            3 -> num1 * num2
            4 -> if (num2 != 0.0) num1 / num2 else "Error! Division by zero."
            else -> "Invalid operation"
        }

        val operation = when (choice) {
            1 -> "Addition"
            2 -> "Subtraction"
            3 -> "Multiplication"
            4 -> "Division"
            else -> ""
        }

        println("\nOperation: $operation")
        println("First Number: $num1")
        println("Second Number: $num2")
        println("Result: $result")
        println("===============================")
    }
}
