//main function
fun main(args : Array<String>){
    println("Welcome to our Landscaping and Gardening Business!")
    println("What would you like to do?")
    println("1. Hire us for a job \n2. Purchase plants")
    var answer = readLine()!!.toInt()
    when(answer) {
        1 -> {
            println("Please fill out the contact form to get started")
            println("What is your name?")
            var name = readLine()
            println("What is your contact information? (e.g. email, phone number")
            var contact = readLine()
            println("What type of job do you need completed? (e.g. mowing, gardening, planting, etc.)")
            var jobType = readLine()
            println("How large is the job? (e.g. acres, square feet, etc.)")
            var jobSize = readLine()
            println("Thank you for your submission. We will be in contact shortly.")
        }
        2 -> {
            println("Welcome to the Plant Shop! Please take a look around.")
            println("What type of plants are you looking for? (e.g. flowers, shrubs, etc.)")
            var plantType = readLine()
            println("How many do you need?")
            var plantNumber = readLine()!!.toInt()
            println("Would you like us to arrange delivery?")
            var deliverAnswer = readLine()!!.toBoolean()
            if (deliverAnswer) {
                println("Please provide us with your delivery address")
            } else {
                println("Please come to our shop to pick up your plants!")
            }
            println("Thank you for your order. We look forward to doing business with you!")
        } 
        else -> {
            println("Sorry, that is not an option. Please try again.")
        }
    }
}