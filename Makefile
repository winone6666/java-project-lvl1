env-prepare:
	ansible ansible all -i ./IdeaProjects/java-project-lvl1/inventory.ini -u winone2 -m ping # проверка доступности сервера