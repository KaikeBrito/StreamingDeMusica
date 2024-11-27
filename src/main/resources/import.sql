INSERT INTO tb_user (id, name, age) VALUES (1, 'João Silva', 25);
INSERT INTO tb_user (id, name, age) VALUES (2, 'Maria Oliveira', 30);
INSERT INTO tb_user (id, name, age) VALUES (3, 'Pedro Santos', 28);

INSERT INTO tb_music (id, name, artist) VALUES (1, 'Shape of You', 'Ed Sheeran');
INSERT INTO tb_music (id, name, artist) VALUES (2, 'Blinding Lights', 'The Weeknd');
INSERT INTO tb_music (id, name, artist) VALUES (3, 'Someone Like You', 'Adele');
INSERT INTO tb_music (id, name, artist) VALUES (4, 'Levitating', 'Dua Lipa');
INSERT INTO tb_music (id, name, artist) VALUES (5, 'Believer', 'Imagine Dragons');

INSERT INTO tb_playlist (id, name, user_id) VALUES (1, 'Pop Hits', 1);
INSERT INTO tb_playlist (id, name, user_id) VALUES (2, 'Relax', 2);
INSERT INTO tb_playlist (id, name, user_id) VALUES (3, 'Workout', 1);
INSERT INTO tb_playlist (id, name, user_id) VALUES (4, 'Top 50', 3);

INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (1, 1, 1);
INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (1, 2, 2);
INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (1, 3, 3);
INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (2, 3, 1);
INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (2, 5, 2);
INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (3, 4, 1);
INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (3, 5, 2);
INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (4, 1, 1);
INSERT INTO tb_playlist_music (playlist_id, music_id, position) VALUES (4, 4, 2);
