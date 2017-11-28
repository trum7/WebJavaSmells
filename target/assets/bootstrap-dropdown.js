+function(e){"use strict";function i(t){var n=t.attr("data-target");if(!n){n=t.attr("href");n=n&&/#[A-Za-z]/.test(n)&&n.replace(/.*(?=#[^\s]*$)/,"")}var r=n&&e(n);return r&&r.length?r:t.parent()}function s(r){if(r&&r.which===3)return;e(t).remove();e(n).each(function(){var t=e(this);var n=i(t);var s={relatedTarget:this};if(!n.hasClass("open"))return;if(r&&r.type=="click"&&/input|textarea/i.test(r.target.tagName)&&e.contains(n[0],r.target))return;n.trigger(r=e.Event("hide.bs.dropdown",s));if(r.isDefaultPrevented())return;t.attr("aria-expanded","false");n.removeClass("open").trigger("hidden.bs.dropdown",s)})}function o(t){return this.each(function(){var n=e(this);var i=n.data("bs.dropdown");if(!i)n.data("bs.dropdown",i=new r(this));if(typeof t=="string")i[t].call(n)})}var t=".dropdown-backdrop";var n='[data-toggle="dropdown"]';var r=function(t){e(t).on("click.bs.dropdown",this.toggle)};r.VERSION="3.3.5";r.prototype.toggle=function(t){var n=e(this);if(n.is(".disabled, :disabled"))return;var r=i(n);var o=r.hasClass("open");s();if(!o){if("ontouchstart"in document.documentElement&&!r.closest(".navbar-nav").length){e(document.createElement("div")).addClass("dropdown-backdrop").insertAfter(e(this)).on("click",s)}var u={relatedTarget:this};r.trigger(t=e.Event("show.bs.dropdown",u));if(t.isDefaultPrevented())return;n.trigger("focus").attr("aria-expanded","true");r.toggleClass("open").trigger("shown.bs.dropdown",u)}return false};r.prototype.keydown=function(t){if(!/(38|40|27|32)/.test(t.which)||/input|textarea/i.test(t.target.tagName))return;var r=e(this);t.preventDefault();t.stopPropagation();if(r.is(".disabled, :disabled"))return;var s=i(r);var o=s.hasClass("open");if(!o&&t.which!=27||o&&t.which==27){if(t.which==27)s.find(n).trigger("focus");return r.trigger("click")}var u=" li:not(.disabled):visible a";var a=s.find(".dropdown-menu"+u);if(!a.length)return;var f=a.index(t.target);if(t.which==38&&f>0)f--;if(t.which==40&&f<a.length-1)f++;if(!~f)f=0;a.eq(f).trigger("focus")};var u=e.fn.dropdown;e.fn.dropdown=o;e.fn.dropdown.Constructor=r;e.fn.dropdown.noConflict=function(){e.fn.dropdown=u;return this};e(document).on("click.bs.dropdown.data-api",s).on("click.bs.dropdown.data-api",".dropdown form",function(e){e.stopPropagation()}).on("click.bs.dropdown.data-api",n,r.prototype.toggle).on("keydown.bs.dropdown.data-api",n,r.prototype.keydown).on("keydown.bs.dropdown.data-api",".dropdown-menu",r.prototype.keydown)}(jQuery)