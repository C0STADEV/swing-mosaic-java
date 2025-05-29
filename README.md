# Mosaic Pattern Generator

A simple Java Swing application that generates and displays a colorful mosaic pattern using a 2D matrix representation.

## 📸 Preview

The application creates a beautiful diamond-shaped mosaic with gradient colors, displayed in a 405x398 pixel window.

## 🎨 Features

- **Colorful Pattern**: Creates a symmetric diamond pattern with 6 different colors
- **Matrix-Based**: Uses a 12x13 integer matrix to define the pattern
- **Customizable**: Easy to modify colors and pixel size
- **Clean UI**: Simple Swing interface with bordered squares
- **Gradient Effect**: Colors transition smoothly from center to edges

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or command line

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/swing-mosaic-java.git
   ```

2. Navigate to the project directory:
   ```bash
   cd swing-mosaic-java
   ```

3. Compile the Java file:
   ```bash
   javac Mosaic.java
   ```

4. Run the application:
   ```bash
   java Mosaic
   ```

## 💻 Usage

To display the mosaic, simply call the `createWindow()` method:

```java
public class Main {
    public static void main(String[] args) {
        Mosaic.createWindow();
    }
}
```

## 🎨 Color Scheme

The mosaic uses the following color mapping:

| Value | Color | RGB Value |
|-------|-------|-----------|
| 0 | White (Background) | `255, 255, 255` |
| 1 | Light Blue | `0, 150, 255` |
| 2 | Orange | `255, 140, 0` |
| 3 | Purple | `180, 0, 255` |
| 4 | Green | `0, 200, 100` |
| 5 | Dark Blue | `0, 50, 180` |

## ⚙️ Customization

### Changing Colors

Modify the `getColor()` method to change the color scheme:

```java
private Color getColor(int value) {
    switch (value) {
        case 1: return new Color(255, 0, 0); // Red
        case 2: return new Color(0, 255, 0); // Green
        // ... add your colors
    }
}
```

### Changing Pixel Size

Adjust the `pixelSize` variable to make squares larger or smaller:

```java
int pixelSize = 50; // Larger squares
```

### Creating New Patterns

Modify the `matrix` array to create different patterns:

```java
int[][] matrix = {
    {1, 2, 3},
    {2, 3, 1},
    {3, 1, 2}
    // Your custom pattern
};
```

## 🏗️ Code Structure

```
Mosaic.java
├── matrix[][]          # 2D array defining the pattern
├── pixelSize          # Size of each square in pixels
├── getColor()         # Maps values to colors
├── paintComponent()   # Renders the mosaic
└── createWindow()     # Creates and displays the window
```

## 🔧 Technical Details

- **Framework**: Java Swing
- **Pattern Size**: 12 rows × 13 columns
- **Window Size**: 405×398 pixels
- **Square Size**: 30×30 pixels (customizable)
- **Border**: Light gray borders around each square

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👨‍💻 Author

**Gustavo Rech Costa**

## 🌟 Acknowledgments

- Inspired by pixel art and mosaic patterns
- Built with Java Swing for simplicity and cross-platform compatibility

---

*Feel free to star ⭐ this repository if you found it helpful!*
