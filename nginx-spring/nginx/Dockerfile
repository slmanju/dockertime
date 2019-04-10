FROM nginx:latest

COPY nginx.conf /etc/nginx/nginx.conf

COPY mj.lk /etc/nginx/sites-available/mj.lk

RUN mkdir /etc/nginx/sites-available/ -p && mkdir /etc/nginx/sites-enabled/ -p

RUN ln -s /etc/nginx/sites-available/mj.lk /etc/nginx/sites-enabled/mj.lk

