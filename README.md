# examen Final - Automatización de Pruebas
**Estudiante:** Gastón Flores   
**Ramo :** 2026-3B-AUTOMATIZACIÓN DE PRUEBAS/300-CED-QM

##  Descripción del Proyecto
Este repo contiene el desarrollo completo para el examen final de la asignatura de **Automatización de Pruebas**. El proyecto implementa un ciclo de vida completo de DevOps, abarcando control de versiones con GitFlow, integración continua (CI) y despliegue continuo con estrategias de mitigación de fallos.

---

##  Estructura y Estrategia Implementada

1. **Gestión de Versiones (Actividad 1):**
    - Configuración de un repositorio local y remoto estructurado bajo un flujo de ramas con `master` y `develop`.
    - Archivo `pom.xml` optimizado con dependencias de **JUnit 5** (pruebas unitarias), **Selenium** (pruebas de interfaz e integración) y **Cucumber** (enfoque BDD).

2. **Pipeline de Integración Continua - CI (Actividad 2):**
    - Automatizado mediante **GitHub Actions** (`ci-pipeline.yml`).
    - Ejecución automatizada de compilación (*build*), pruebas unitarias y pruebas de integración ejecutándose en un entorno Linux headless con soporte para Firefox.

3. **Pipeline de Despliegue y Rollback - CD (Actividad 3):**
    - Automatizado mediante `cd-pipeline.yml`.
    - Incorpora validación previa con Pruebas de Aceptación (UAT).
    - Implementa simulación de despliegue **Blue-Green** con un mecanismo condicional de **Rollback automático** en caso de que ocurra algún fallo en el ambiente.

---

##  Instrucciones de Ejecución Local
Para compilar el proyecto y ejecutar las pruebas de manera local mediante Maven:
- **Ejecutar solo compilación y pruebas unitarias:** `mvn clean test`
- **Ejecutar ciclo completo de verificación:** `mvn verify`