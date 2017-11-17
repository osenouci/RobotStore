/** Categories **/
INSERT INTO category (id, name) VALUES(1, 'Toy Robots');
INSERT INTO category (id, name) VALUES(2, 'Educational Robots');
INSERT INTO category (id, name) VALUES(3, 'Cleaning robots');
INSERT INTO category (id, name) VALUES(4, 'Industrial robots');


/** Toy robots **/
INSERT INTO robot (id, cat_id, price, name , description) VALUES(2, 1, 139.99, 'Sphero Star Wars BB-8 Bluetooth Smartphone Controlled Robotic Ball', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque facilisis purus ac feugiat tincidunt. Aenean euismod ligula eu leo luctus mollis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer maximus non neque vitae placerat. Sed elementum mauris lectus. Aliquam tincidunt luctus elit eu egestas. Ut id nibh ac metus tincidunt condimentum. Cras sagittis pellentesque posuere. Donec eu velit sem. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.');
INSERT INTO photo (id, rob_id, url) VALUES(6,  2, 'http://www.robotshop.com/media/catalog/product/cache/1/image/900x900/9df78eab33525d08d6e5fb8d27136e95/s/p/sphero-star-wars-bb-8-bluetooth-smartphone-controlled-robotic-ball-1.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(7,  2, 'http://www.robotshop.com/media/catalog/product/cache/1/image/900x900/9df78eab33525d08d6e5fb8d27136e95/s/p/sphero-star-wars-bb-8-bluetooth-smartphone-controlled-robotic-ball-2.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(8,  2, 'http://www.robotshop.com/media/catalog/product/cache/1/image/900x900/9df78eab33525d08d6e5fb8d27136e95/s/p/sphero-star-wars-bb-8-bluetooth-smartphone-controlled-robotic-ball_1.jpg');

INSERT INTO robot (id, cat_id, price, name, description) VALUES(3, 1, 209.99, 'MiP - WowWee', 'Robotics company WowWee teamed up with the Flow Control and Coordinated Robotics Lab at the University of California San Diego to create MiP, a tiny robot that can perform a multitude of tasks such as balancing objects and tracking. Download the MiP app (free for Apple and Android) to unlock even more fun features.');
INSERT INTO photo (id, rob_id, url) VALUES(9 ,  3, 'https://cdn-all.coolstuff.com/autogen/preset/aspectThumb/1200x900/66c2da409077e0dfaf048615252c8128.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(10,  3, 'https://static.telus.com/common/cms/images/mobility/features/accessories/ntoy1002/wowwee_sensible_robot.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(11,  3, 'https://target.scene7.com/is/image/Target/15293992_Alt02?wid=520&hei=520&fmt=pjpeg');

/** Educational robots **/
INSERT INTO robot (id, cat_id, price, name , description) VALUES(1, 2, 84.99, 'Makeblock mBot v1.1 Blue STEM Educational Programmable Robot (Bluetooth)', 'Vestibulum nisl eros, porta mattis porttitor ac, viverra eget nulla. Morbi hendrerit interdum augue, eu ultrices augue eleifend vitae. Cras ut odio nec mi consectetur vehicula dictum a ipsum. Etiam congue, augue at dignissim porttitor, ante nunc tincidunt enim, in aliquet sem sem sit amet magna. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed consectetur risus quis varius varius. Vestibulum eu nunc nec nisi venenatis tincidunt. Nulla non ullamcorper ante. Ut lectus lectus, malesuada ut orci in, placerat finibus magna. Fusce blandit, est at venenatis viverra, est mi commodo odio, commodo volutpat elit urna ac orci. Donec vitae iaculis erat, congue interdum libero.');
INSERT INTO photo (id, rob_id, url) VALUES(1, 1, 'http://www.robotshop.com/media/catalog/product/cache/1/image/900x900/9df78eab33525d08d6e5fb8d27136e95/m/a/makeblock-mbot-blue-stem-educational-programmable-robot.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(2, 1, 'http://www.robotshop.com/media/catalog/product/cache/1/image/900x900/9df78eab33525d08d6e5fb8d27136e95/m/a/makeblock-mbot-blue-stem-educational-programmable-robot-1.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(3, 1, 'http://www.robotshop.com/media/catalog/product/cache/1/image/900x900/9df78eab33525d08d6e5fb8d27136e95/m/a/makeblock-mbot-blue-stem-educational-programmable-robot-2.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(4, 1, 'http://www.robotshop.com/media/catalog/product/cache/1/image/900x900/9df78eab33525d08d6e5fb8d27136e95/m/a/makeblock-mbot-blue-stem-educational-programmable-robot-3.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(5, 1, 'http://www.robotshop.com/media/catalog/product/cache/1/image/900x900/9df78eab33525d08d6e5fb8d27136e95/m/a/makeblock-mbot-blue-stem-educational-programmable-robot-4.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(4, 2, 240.13, 'Abilix STEM Educational Building Block Robot', 'description');
INSERT INTO photo (id, rob_id, url) VALUES(12, 4, 'https://images-na.ssl-images-amazon.com/images/I/61xoB58%2BE7L._SL1000_.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(13, 4, 'https://images-na.ssl-images-amazon.com/images/I/51BPPLuze%2BL._SL1000_.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(5, 2, 34.00, 'Educational Robot Kit', 'Robo Kit has been accepted and was adopted as the “Creative Engineering Design" course by the School of mechanical and Aerospace Engineering, Seoul National University it is a new concept learning tool that improves creativity and thinking power as well as interests because the robot structure and robot program may freely be configured. This product provides the programming environment of the concept of flowing charts escaping from the limit in existing robot programming methods to input letters and the beginners with no experience may easily followthe sequence. Also, various structures and sensors and motor module are supplied, the learner may make various creative robots.');
INSERT INTO photo (id, rob_id, url) VALUES(14, 5, 'http://roborobo.koreasme.com/img/robo_kit01.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(15, 5, 'https://images-na.ssl-images-amazon.com/images/I/51BPPLuze%2BL._SL1000_.jpg');


/** Cleaning robotos **/
INSERT INTO robot (id, cat_id, price, name , description) VALUES(6, 3, 34.54, 'Medion MD 16192/2200', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(16, 6, 'https://images-na.ssl-images-amazon.com/images/I/71wBqY68%2BEL._SL1500_.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(17, 6, 'https://images-na.ssl-images-amazon.com/images/I/71Amupy-M7L._SL1500_.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(7, 3, 264.00, 'Dirt Devil M607 Spider', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(18, 7, 'https://images-na.ssl-images-amazon.com/images/I/71wBqY68%2BEL._SL1500_.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(19, 7, 'https://images-na.ssl-images-amazon.com/images/I/71Amupy-M7L._SL1500_.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(8, 3, 230.00, 'Dirt Devil M6000X', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(20, 8, 'https://images-na.ssl-images-amazon.com/images/I/714OM5WE0BL._SL1500_.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(21, 8, 'https://images-na.ssl-images-amazon.com/images/I/910GgUQgMoL._SL1500_.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(9, 3, 460.00, 'Holife Vacuum Cleaner', 'Robot Vacuum Cleaner with Siri and Amazon Alexa Voice Control WiFi, Timing Advance Clean Selbstaufladend, Navigation, 1500 PA HEPA Filter for those allergic to Animal Hair Suction');
INSERT INTO photo (id, rob_id, url) VALUES(22, 9, 'https://images-na.ssl-images-amazon.com/images/I/71uNA-g%2BGvL._SL1500_.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(23, 9, 'https://images-na.ssl-images-amazon.com/images/I/81VrkGfQWLL._SL1200_.jpg');

/** Industrial robots **/
INSERT INTO robot (id, cat_id, price, name , description) VALUES(10, 4, 150.00, 'SainSmart DIY 6-Axis Control Palletizing Robot Arm Model for Arduino UNO', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(24, 10, 'https://images-na.ssl-images-amazon.com/images/I/41z30MZLv3L.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(25, 10, 'https://images-na.ssl-images-amazon.com/images/I/41bVAvj8WTL.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(11, 4, 199.99, '4-Axis Control Palletizing Robot Arm Model DIY ', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(26, 11, 'https://images-na.ssl-images-amazon.com/images/I/51bqbWJmG3L._SL1001_.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(27, 11, 'https://images-na.ssl-images-amazon.com/images/I/61tdPhX0deL._SL1001_.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(12, 4, 6200.00, '6 axis industrial robot industrial robot arm for factory', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(28, 12, 'https://sc01.alicdn.com/kf/HTB1mPPlNpXXXXbWapXXq6xXFXXXV/6-axis-industrial-robot-industrial-robot-arm.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(29, 12, 'https://niryo.com/wp-content/uploads/2016/11/industrial_robots.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(13, 4, 2300.00, 'DBH six axis industrial robot arm price for assembly line', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(30, 13, 'https://sc02.alicdn.com/kf/HTB1qWfAXfTM8KJjSZFDq6yltXXaA/DBH-six-axis-industrial-robot-arm-price.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(31, 13, 'https://sc01.alicdn.com/kf/HTB1H78zXxPI8KJjSspfq6ACFXXaT/DBH-six-axis-industrial-robot-arm-price.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(14, 4, 15000.00, 'ANUC R2000iB/210F Industrial Robot', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(32, 14, 'https://surplex-res.cloudinary.com/images/c_fit,d_no_image.png,f_auto,h_700,q_80,w_940/i_02282839/FANUC_R2000iB210F_Industrial_Robot.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(33, 14, 'https://surplex-res.cloudinary.com/images/c_fit,d_no_image.png,f_auto,h_700,q_80,w_940/i_02222096/FANUC_R2000iB210F_Industrial_Robot.jpg');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(15, 4, 20000.00, 'Kuka and Boll', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(34, 15, 'https://i0.wp.com/roboticsandautomationnews.com/wp-content/uploads/2016/08/kuka-systems.jpg?zoom=2&resize=825%2C510');
INSERT INTO photo (id, rob_id, url) VALUES(35, 15, 'https://i1.wp.com/roboticsandautomationnews.com/wp-content/uploads/2016/07/kuka-quantec-daimler.jpg?w=564&ssl=1');

INSERT INTO robot (id, cat_id, price, name , description) VALUES(16, 4, 14000.00, 'RobotWorx Blue FX6457', 'Cras sodales elit purus, nec hendrerit eros ultricies maximus. Cras augue urna, ullamcorper id neque a, aliquam malesuada est. Sed finibus libero vel auctor pharetra. Morbi eu pharetra lacus. Morbi interdum, mi a dapibus accumsan, lectus ex pellentesque justo, eu rutrum enim mauris id mauris. Curabitur id elementum sem. Donec ac arcu sit amet lectus tincidunt varius ac sed mi. Aliquam lacus nunc, bibendum eget laoreet ut, suscipit sit amet risus. Suspendisse rhoncus elementum dui, vitae viverra ex feugiat sit amet. Maecenas aliquam libero sem, ac dignissim tellus tincidunt a. Vivamus mi odio, tempus non tortor in, eleifend tempor ex. Sed ac tortor vitae risus gravida venenatis.');
INSERT INTO photo (id, rob_id, url) VALUES(36, 16, 'https://media.robots.com/robots/1480539438_3.jpg');
INSERT INTO photo (id, rob_id, url) VALUES(37, 16, 'https://media.robots.com/robots/1477321566_2.jpg');

