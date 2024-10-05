# Java Swing Turtle Checkerboard Project

This project is a Java Swing-based turtle graphics program that draws a simple checkerboard pattern using a Turtle class and a World class. The program visually demonstrates basic Java Swing concepts and object-oriented programming through the use of turtle graphics, making it an engaging way to illustrate fundamental programming techniques.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [Code Explanation](#code-explanation)
- [Future Enhancements](#future-enhancements)
- [License](#license)

## Overview

This is another iteration of a Java Swing turtle graphics project, where the turtle is used to draw a checkerboard pattern. The project leverages a Turtle class to move and draw on a canvas, creating a visual representation of a standard 8x8 checkerboard.

## Features

- Draws a 4x4 checkerboard pattern using turtle graphics.
- Utilizes basic Java Swing components for visual representation.
- Demonstrates basic looping and method usage in Java.
- Explores concepts of object-oriented programming through the creation and manipulation of Turtle objects.

## Usage

To run this project, you will need to have Java installed on your system. Follow these steps:

1. Clone the repository to your local machine.
2. Compile the Java files:
   ```bash
   javac src/TurtleCheckerboard.java
   ```
3. Run the program:
   ```bash
   java src.TurtleCheckerboard
   ```

The program will display a 500x500 window with a 4x4 checkerboard pattern drawn by a turtle object.

## Code Explanation

Here is a brief overview of the main components of the program:

- **`World` Class**: Initializes the canvas for the turtle to draw on. In this case, a 500x500 pixel window.
- **`Turtle` Class**: Represents the turtle that moves around the canvas, drawing squares to create the checkerboard pattern.
- **`main()` Method**: Sets up the World, initializes the Turtle, and uses nested loops to draw the checkerboard pattern.

### Key Methods:

- `tomTurtle.moveTo(x, y)`: Moves the turtle to the specified `(x, y)` coordinates.
- `tomTurtle.drawSquare()`: A custom method used to draw a square at the current turtle position.
- `tomTurtle.setHeading(degrees)`: Sets the turtle's heading direction in degrees.
- `tomTurtle.penUp()` and `tomTurtle.penDown()`: Lifts or places the pen on the canvas to start or stop drawing.

## Future Enhancements

Potential future enhancements for this project include:

- Expanding the checkerboard to the full 8x8 pattern.
- Adding alternating colors for the checkerboard squares.
- Allowing user input to specify board size and colors.

## License

This project is open-source and available under the [MIT License](LICENSE).

## Author

Jai Vang

## Acknowledgements

The original Turtle and World classes were inspired by the work of Georgia Institute of Technology and are used for educational purposes.
