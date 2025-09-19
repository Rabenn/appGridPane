# Aplicación Sencilla con GridPane - JavaFX

## Descripción
Esta es una aplicación de escritorio sencilla desarrollada en **JavaFX**, que utiliza un **GridPane** para organizar la interfaz de usuario. La interfaz se carga desde un archivo **FXML** y se aplica un estilo mediante un archivo **CSS**.  
Cuenta con campos de texto, un área de texto, botones de acción y una barra de estado que se mantiene fija en la parte inferior izquierda.

---

## Características
- Interfaz organizada con **GridPane**.
- Campos de entrada: `TextField` y `TextArea`.
- Botones **Ok** y **Cancel** alineados en la columna derecha.
- Barra de estado `"Status: Ready"` fija en la parte inferior izquierda.
- Tamaño mínimo de la ventana para evitar colapso de componentes.
- Estilos aplicados mediante `styles.css`.
- Logging simple con **SLF4J** para seguimiento de eventos.

---

## Requisitos
- **Java 17+** (o superior, según versión de JavaFX que uses)
- **JavaFX 24** (se recomienda que FXML y runtime tengan la misma versión)
- **Maven** o **Gradle** para manejar dependencias opcionales.
- **SLF4J** para logging.

---
