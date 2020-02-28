# Progra_avancee_orchestre
Projet pour le ds de programation avancée

## Liste des classes et leur Design Pattern
- Serveur.java : singleton
- Partition.java
- FactoryMusicien.java : factory
- InterfaceMusicien.java : interface des musiciens. Est utile aux classes MusicienTrompette.java, MusicienPiano.java et MusicienViolon.java

## Tests unitaires
- TestServeurPartition: vérifie l'enregistrement des partitions auprès du serveur et des musiciens
- TestServeurMusicien : vérifie l'enregistrement des musiciens auprès du serveur
- TestFactoryMusicien : vérifie la création des musiciens
