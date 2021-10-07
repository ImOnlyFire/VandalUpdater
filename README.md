# VandalUpdater 
VandalUpdater is a spiget based Autoupdater with download support.

## 🔥 Usage
First of all, you need to add the jitpack repository to your pom.xml:

```pom.xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

Then, you need to add the VandalUpdater dependency:

```pom.xml
	<dependency>
	    <groupId>com.github.ImOnlyFire.VandalUpdater</groupId>
	    <artifactId>updater</artifactId>
	    <version>1.0</version>
	</dependency>
```

If you want, you can also relocate the updater, View the [Example](https://github.com/ImOnlyFire/VandalUpdater/tree/master/Example) page

API Usage: View the [Example](https://github.com/ImOnlyFire/VandalUpdater/tree/master/Example) page

## 🎈 Compiling VandalUpdater Locally

**Required Dependencies:**

* Java 8+
* Maven
* An Internet connection (Well, if you are reading this it means that you already have it 👀)

Simple, just clone this repository with `git clone https://github.com/ImOnlyFire/VandalUpdater.git`
and then build the project with `mvn clean install`. Your new jar is located at `Updater/target/updater-$VERSION.jar`.
