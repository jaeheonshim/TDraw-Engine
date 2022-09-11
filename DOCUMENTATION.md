# Documentation

## `public void forward(int d)`

Moves the turtle forward in the direction it is facing

 * **Parameters:** `d` — Distance to move forward

## `public void backward(int d)`

Moves the turtle backward in the opposite direction

 * **Parameters:** `d` — Distance to move backward

## `public void right(int d)`

Moves the turtle to the right with respect to its current heading

 * **Parameters:** `d` — Distance to move right

## `public void left(int d)`

Moves the turtle to the left with respect to its current heading

 * **Parameters:** `d` — Distance to move left

## `public void setPosition(int x, int y)`

Sets the absolute position of the turtle (This method CANNOT be used for drawing)

 * **Parameters:**
   * `x` — x coordinate of the new position
   * `y` — y coordinate of the new position

## `public void home()`

Moves the turtle back to the (0, 0) position

## `public void setX(int x)`

Sets the x-coordinate of the turtle (This method CANNOT be used for drawing)

 * **Parameters:** `x` — x coordinate of the new position

## `public void setY(int y)`

Sets the y-coordinate of the turtle (This method CANNOT be used for drawing)

 * **Parameters:** `y` — y coordinate of the new position

## `public void setHeading(double theta)`

Sets the absolute heading of the turtle

0 degrees is the 3 o'clock position, 90 degrees is the 12 o'clock position, 180 degrees is the 9 o'clock position, 270 degrees is the 6 o'clock position

 * **Parameters:** `theta` — angle (in degrees) of the new position

## `public void clockwise(double theta)`

Turns the turtle clockwise

 * **Parameters:** `theta` — angle (in degrees) to turn turtle clockwise by

## `public void counterClockwise(double theta)`

Turns the turtle counterclockwise

 * **Parameters:** `theta` — angle (in degrees) to turn turtle counterclockwise by

## `public Vector2 getPosition()`

Returns the position of the turtle

 * **Returns:** the position of the turtle

## `public double getHeading()`

Returns the heading of the turtle

 * **Returns:** the heading of the turtle, in degrees

## `public void penDown()`

Puts the pen of the turtle down to start drawing

## `public void penUp()`

Lifts the pen of the turtle up to stop drawing

## `public void setColor(Color color)`

Sets the color of the pen

 * **Parameters:** `color` — Color

## `public boolean isPenDown()`

Returns true if the pen is down (and the turtle is currently drawing) and false if the pen is up

 * **Returns:** Current state of the turtle's pen
