install:
	sudo cp -R javafx-sdk-16/ /usr/lib/
	sudo install JCalculator /usr/bin
remove:
	sudo rm -rf /usr/lib/javafx-sdk-16
	sudo rm -rf /usr/bin/JCalculator
