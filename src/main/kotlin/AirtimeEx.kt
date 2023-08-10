fun main(args: Array<String>) {

    println("Enter Number to Initialize airtime request")


    var airtimedisplay = readLine()!!.toInt()
    when (airtimedisplay){

        1-> print("Blaze bundles")
        2-> print("Go Weekly Bundles")
        3-> print("Go Daily Bundles")
        4-> print("Go Monthly Bundles")
        5-> print("Okoa data")
        6-> print("Buy Minutes")
        7-> print("Tiktok Bundles")
        8-> print("My account")
        9-> print("Gift a bundle")

        else-> print("EXIT")

    }


}