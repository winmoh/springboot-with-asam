import { Component, OnInit, AfterViewInit } from '@angular/core';
import * as feather from 'feather-icons';

declare var $: any; // This line is needed if jQuery is not declared globally

@Component({
  selector: 'app-welcome-page',
  templateUrl: './welcome-page.component.html',
  styleUrls: ['./welcome-page.component.css']
})
export class WelcomePageComponent implements OnInit, AfterViewInit {

  constructor() { }

  ngOnInit(): void {
    // You can put any initialization code here
  }

  ngAfterViewInit(): void {
    // Initialize feather icons
    feather.replace();

    // Initialize tooltip & popovers
    $('[data-toggle="tooltip"]').tooltip();
    $('[data-toggle="popover"]').popover();

    // Page scroll
    $('a.page-scroll').on('click', (event: any) => {
      const $anchor = $(event.currentTarget);
      $('html, body').stop().animate({
        scrollTop: $($anchor.attr('href')).offset().top - 20
      }, 1000);
      event.preventDefault();
    });

    // Slick slider
    $('.slick-about').slick({
      slidesToShow: 1,
      slidesToScroll: 1,
      autoplay: true,
      autoplaySpeed: 3000,
      dots: true,
      arrows: false
    });

    // Toggle scroll menu
    let scrollTop = 0;
    $(window).scroll(() => {
      const scroll = $(window).scrollTop();
      // Adjust menu background
      if (scroll > 80) {
        if (scroll > scrollTop) {
          $('.smart-scroll').addClass('scrolling').removeClass('up');
        } else {
          $('.smart-scroll').addClass('up');
        }
      } else {
        $('.smart-scroll').removeClass('scrolling').removeClass('up');
      }

      scrollTop = scroll;

      // Adjust scroll to top
      if (scroll >= 600) {
        $('.scroll-top').addClass('active');
      } else {
        $('.scroll-top').removeClass('active');
      }
    });

    // Scroll to top
    $('.scroll-top').click(() => {
      $('html, body').stop().animate({
        scrollTop: 0
      }, 1000);
    });

    // Theme switcher - DEMO PURPOSE ONLY
    $('.switcher-trigger').click(() => {
      $('.switcher-wrap').toggleClass('active');
    });
    $('.color-switcher ul li').click((event: any) => {
      const target = $(event.currentTarget);
      const color = target.attr('data-color');
      $('#theme-color').attr("href", "css/" + color + ".css");
      $('.color-switcher ul li').removeClass('active');
      target.addClass('active');
    });
    
    
    
    
  }

}
