package pascal_triangle

object PascalTriangle {

  /**
   *   The numbers at the edge of the triangle are all 1, and each number inside the triangle is the sum of
   *   the two numbers above it.
   *
   *   The pascal function takes a column c and a row r, counting from 0 and returns the number at that spot
   *   in the triangle. For example, pascal(0,2)=1, pascal(1,2)=2 and pascal(1,3)=3.
   */
  def pascal(c: Int, r: Int): Int = ???


  def toString(rows: Int) {
    println("Pascal's Triangle")
    for (row <- 0 to rows) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

}
