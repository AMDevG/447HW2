object CountDown{
	
	def main(args: Array[String]): Unit = {
		println("Running main")
		counter(args)
	}

	def counter(x:Array[String]) = {
		x.foreach(num => print(" " + num))
		}
	}
