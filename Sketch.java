import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import processing.core.PApplet;

public class Sketch extends PApplet {

  // declare variables 
  int cellWidth = 20;
  int cellHeight = 20;
  int margin = 5;
  int rowCount = 10;
  int columnCount = 10;
  int screenWidth = (cellWidth + margin) * rowCount + margin;
  int screenHeight = (cellHeight + margin) * columnCount + margin;

  int[][] grid = new int [rowCount][columnCount];

  int cellPressed = 0;
  int rowPressed = 0;
  int columnPressed = 0;
  int multiplePressed = 0;


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(screenWidth, screenHeight);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
    }
  

  /*
   * Called repeatedly, anything drawn to the screen goes here
   */

  public void draw() {
    // draw grid
    for (int column = 0; column < columnCount; column++){
      for (int row = 0; row < rowCount; row++){
        if(grid[row][column] == 1){
        fill(0,255,0);
        rect(row * (cellWidth + margin) + margin, + column * (cellHeight + margin) + margin, cellWidth, cellHeight);
        } else {
        fill(255);
        rect(row * (cellWidth + margin) + margin, + column * (cellHeight + margin) + margin, cellWidth, cellHeight);
      }
    }
  }
}
  public void mousePressed(){
    for (int row = 0; row < rowCount; row++){
      for(int column = 0; column < columnCount; column++){
        if((mouseX > row * (cellWidth + margin) + margin && mouseX < row * (cellWidth + margin) + margin + cellWidth) && (mouseY > column * (cellHeight + margin) + margin && mouseY < column * (cellHeight + margin) + margin + cellHeight)){
          System.out.println("Mouse location: " +  ("(" + mouseX + "," + mouseY + ")") + " and Grid location: " + ("row: " +  column + 1) + " column " + (row + 1));
          // top left
          if(row == 0 && column == 0){
            if(grid[row][column] == 0){
              grid[row][column] = 1;
              cellPressed++;
            } 
            else if (grid[row][column] == 1){
              grid[row][column] = 0;
              cellPressed--;
              
            }
          if(grid[row + 1][column] == 0){
            grid[row + 1][column] = 1;
            cellPressed++;
          }
          else if (grid[row + 1][column] == 1){
            grid[row + 1][column] = 0;
            cellPressed--;
          }
          if(grid[row][column + 1] == 0){
            grid[row][column + 1] = 1;
            cellPressed++;
          }
          else if (grid[row][column + 1] == 1){
            grid[row][column + 1] = 0;
            cellPressed--;
            }
          }
          // top right
          else if (row == (rowCount - 1) && column == 0){
            if(grid[row][column] == 0){
              grid[row][column] = 1;
              cellPressed++;
            } 
            else if (grid[row][column] == 1){
              grid[row][column] = 0;
              cellPressed--;
            }
            if (grid[row - 1][column] == 0){
              grid[row - 1][column] = 1;
              cellPressed++;
            }
            else if (grid[row - 1][column] == 1){
              grid[row - 1][column] = 0;
              cellPressed--;
            }
            if(grid[row][column + 1] == 0){
              grid[row][column + 1] = 1;
              cellPressed++;
            }
            else if(grid[row][column + 1] == 1){
              grid[row][column + 1] = 0;
              cellPressed--;
            }
          }
          // bottom left
          else if (row == 0 && column == (columnCount - 1)){
            if(grid[row][column] == 0){
              grid[row][column] = 1;
              cellPressed++;
            } 
            else if (grid[row][column] == 1){
              grid[row][column] = 0;
              cellPressed--;
            }
            if (grid[row + 1][column] == 0){
              grid[row + 1][column] = 1;
              cellPressed++;
            }
            else if (grid[row + 1][column] == 1){
              grid[row + 1][column] = 0;
              cellPressed--;
            }
            if(grid[row][column - 1] == 0){
              grid[row][column - 1] = 1;
              cellPressed++;
            }
            else if(grid[row][column - 1] == 1){
              grid[row][column - 1] = 0;
              cellPressed--;
        }
      }
          // bottom right
          else if (row == (rowCount - 1) && column == (columnCount - 1)){
            if(grid[row][column] == 0){
              grid[row][column] = 1;
              cellPressed++;
            } 
            else if (grid[row][column] == 1){
              grid[row][column] = 0;
              cellPressed--;
            }
            if (grid[row - 1][column] == 0){
              grid[row - 1][column] = 1;
              cellPressed++;
            }
            else if (grid[row - 1][column] == 1){
              grid[row - 1][column] = 0;
              cellPressed--;
            }
            if(grid[row][column - 1] == 0){
              grid[row][column - 1] = 1;
              cellPressed++;
            }
            else if(grid[row][column - 1] == 1){
              grid[row][column - 1] = 0;
              cellPressed--;
            }
          }
        
          else if (column == (columnCount - 1)){
            if(grid[row][column] == 0){
              grid[row][column] = 1;
              cellPressed++;
          }
            else if(grid[row][column] == 1){
              grid[row][column] = 0;
              cellPressed--;
          }
            if(grid[row + 1][column] == 0){
              grid[row + 1][column] = 1;
              cellPressed++;
          }
            else if(grid[row + 1][column] == 1){
              grid[row + 1][column] = 0;
              cellPressed--;
          }
          if(grid[row - 1][column] == 0){
            grid[row - 1][column] = 1;
            cellPressed++;
          }
          else if(grid[row - 1][column] == 1){
            grid[row - 1][column] = 0;
            cellPressed--;
          }
          if(grid[row][column - 1] == 0){
            grid[row][column - 1] = 1;
            cellPressed++;
          }
          else if(grid[row][column - 1] == 1){
            grid[row][column - 1] = 0;
            cellPressed--;
           }
          }

          else if (column == 0){
            if(grid[row][column] == 0){
              grid[row][column] = 1;
              cellPressed++;
            }
            else if(grid[row][column] == 1){
              grid[row][column] = 0;
              cellPressed--;
            }
            if(grid[row + 1][column] == 0){
              grid[row + 1][column] = 1;
              cellPressed++;
            }
            else if(grid[row + 1][column] == 1){
              grid[row + 1][column] = 0;
              cellPressed--;
            }
            if(grid[row - 1][column] == 0){
              grid[row - 1][column] = 1;
              cellPressed++;
            }
            else if(grid[row - 1][column] == 1){
              grid[row - 1][column] = 0;
              cellPressed--;
            }
            if(grid[row][column + 1] == 0){
              grid[row][column + 1] = 1;
              cellPressed++;
            }
            else if(grid[row][column + 1] == 1){
              grid[row][column + 1] = 0;
              cellPressed--;
              }
            }

          else if (row == 0){
            if(grid[row][column] == 0){
              grid[row][column] = 1;
              cellPressed++;
            }
            else if(grid[row][column] == 1){
              grid[row][column] = 0;
              cellPressed--;
            }
            if(grid[row + 1][column] == 0){
              grid[row + 1][column] = 1;
              cellPressed++;
            }
            else if(grid[row + 1][column] == 1){
              grid[row + 1][column] = 0;
              cellPressed--;
            }
            if(grid[row][column + 1] == 0){
              grid[row][column + 1] = 1;
              cellPressed++;
            }
            else if(grid[row][column + 1] == 1){
              grid[row][column + 1] = 0;
              cellPressed--;
            }
            if(grid[row][column - 1] == 0){
              grid[row][column - 1] = 1;
              cellPressed++;
            }
            else if(grid[row][column - 1] == 1){
              grid[row][column - 1] = 0;
              cellPressed--;
              }
            }

          else if (row == (rowCount - 1)){
            if(grid[row][column] == 0){
              grid[row][column] = 1;
              cellPressed++;
              }
            else if(grid[row][column] == 1){
              grid[row][column] = 0;
              cellPressed--;
              }
            if(grid[row - 1][column] == 0){
              grid[row - 1][column] = 1;
              cellPressed++;
              }
            else if(grid[row - 1][column] == 1){
              grid[row - 1][column] = 0;
              cellPressed--;
              }
            if(grid[row][column + 1] == 0){
              grid[row][column + 1] = 1;
              cellPressed++;
              }
            else if(grid[row][column + 1] == 1){
              grid[row][column + 1] = 0;
              cellPressed--;
              }
            if(grid[row][column - 1] == 0){
              grid[row][column - 1] = 1;
              cellPressed++;
              }
            else if(grid[row][column - 1] == 1){
              grid[row][column - 1] = 0;
              cellPressed--;
                }
              }
            // everywhere else on the screen
          else {
            if(grid[row][column] == 0){
              grid[row][column] = 1;
                cellPressed++;
              }
              else if(grid[row][column] == 1){
                grid[row][column] = 0;
                cellPressed--;
              }
              if(grid[row + 1][column] == 0){
                grid[row + 1][column] = 1;
                cellPressed++;
              }
              else if(grid[row + 1][column] == 1){
                grid[row + 1][column] = 0;
                cellPressed--;
              }
              if(grid[row - 1][column] == 0){
                grid[row - 1][column] = 1;
                cellPressed++;
              }
              else if(grid[row - 1][column] == 1){
                grid[row - 1][column] = 0;
                cellPressed--;
              }
              if(grid[row][column + 1] == 0){
                grid[row][column + 1] = 1;
                cellPressed++;
              }
              else if(grid[row][column + 1] == 1){
                grid[row][column + 1] = 0;
                cellPressed--;
              }
              if(grid[row][column - 1] == 0){
                grid[row][column - 1] = 1;
                cellPressed++;
              }
              else if(grid[row][column - 1] == 1){
                grid[row][column - 1] = 0;
                cellPressed--;
                }
              }
            // output # of cells pressed
            System.out.println(cellPressed + " cells are pressed");

        }
      }
    }
    for (int row = 0; row < rowCount; row++){
      for (int column = 0; column < columnCount; column++){
        if(grid[row][column] == 1){
          rowPressed++;
        }
        
        if(column < columnCount - 1 && grid[row][column] == 1 && grid[row][column + 1] == 1){ 
          multiplePressed++;
        } else if (column > 0 && column < columnCount && grid[row][column - 1] == 1 && grid[row][column] == 1 && column == columnCount - 1){
          multiplePressed++;
        } else if (column > 0 && column < columnCount && grid[row][column - 1] == 1 && grid[row][column] == 1 && grid[row][column + 1] == 1 && column < columnCount - 1){
          multiplePressed++;
        }
      }
      // Prints how many multiple cells are pressed
      if (multiplePressed > 0 && rowPressed > 2){
        System.out.println( (multiplePressed + 1) + " multiple cells are pressed in column " + (row + 1));
      }
        System.out.println("There are a total of " + rowPressed + " cells pressed in column " + (row + 1));
    

    // Set the varible back to 0
    multiplePressed = 0;
    rowPressed = 0;
  }
  // Cells pressed in each column
  for (int column = 0; column < columnCount; column++){
    for (int row = 0; row < rowCount; row++){
      if(grid[row][column] == 1){
        columnPressed++;
      }
    }
    System.out.println(columnPressed + " cells are pressed in row " + (column + 1));

    columnPressed = 0;
    }
  }
}

