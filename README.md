# RPG-Java

Base de un juego RPG de peleas por consola, escrito en Java para practicar Programación Orientada a Objetos: herencia, encapsulamiento y sobrecarga de constructores.

> **Estado: en desarrollo.** Los personajes y su creación ya funcionan; el combate por turnos todavía no está implementado.

## Qué incluye hoy

- [x] Clase base `Personaje` con nombre, HP, ATK, DEF y estado (vivo/muerto), con los métodos `atacar()` y `recibirDaño()`
- [x] Clases `Caballero` (Fuerza, Escudo, Espada) y `Mago` (Poder, Varita, Maná) que heredan de `Personaje` y ajustan sus estadísticas según sus atributos
- [x] Creación de personajes por consola (`CrearPersonaje`)
- [ ] `Arena`: por ahora crea dos personajes y anuncia el combate; falta el ciclo de turnos
- [ ] Usar la defensa (DEF) al calcular el daño recibido
- [ ] Menú principal que conecte la creación de personajes con la arena

## Estructura

```text
src/
├── App.java          # Punto de entrada (demo con un Caballero y un Mago)
├── Personaje/        # Personaje, Caballero, Mago
├── pelea/            # Arena
├── UI/               # CrearPersonaje
└── Interface/        # Constantes de presentación (separadores)
```

## Cómo ejecutar

Requiere **JDK 25**: el proyecto usa `void main()` sin declarar clase y `IO.readln`, características de las versiones recientes de Java.

1. Clona el repositorio:

```bash
git clone https://github.com/JCastellanosDev/RPG-Java.git
```

2. Ábrelo en IntelliJ IDEA.
3. Ejecuta `App.java`.

## Autor

Jesús Castellanos - [@JCastellanosDev](https://github.com/JCastellanosDev)
